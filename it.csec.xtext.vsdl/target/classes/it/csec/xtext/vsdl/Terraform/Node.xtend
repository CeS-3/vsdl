package it.csec.xtext.vsdl.Terraform

import org.eclipse.xtend.lib.annotations.Accessors
import it.csec.xtext.VsdlResources
import java.util.ArrayList
import java.util.Optional

class Node extends ScenElem {
    @Accessors
    private var Flavor flavor
    @Accessors
    private String flavorId = ""
    @Accessors
    private int OS
    @Accessors
    private String OSid = ""
    @Accessors
    private ArrayList<Interface> interfaces = new ArrayList<Interface>()

    new(String name) {
        this.name = name
        
        flavor = new Flavor()
        OS = 0
        OSid = ""
        
        interfaces = new ArrayList<Interface>()
    }
    
    def toTerraformString() {
	    var flag = false
	    var i = 0
	    var cf = VsdlResources.OSClient.compute
	    var fl = cf.flavors.list
	    
	    // Search for an existing flavor in OpenStack
	    while (!flag && i < fl.size) {
	        var f = fl.get(i)
	        if (f.disk == (flavor.disk / 1024) &&
	            f.ram == flavor.ram && 
	            f.vcpus == flavor.vcpu) {
	                flag = true
	                flavorId = f.id
	        }
	        i++
	    }
	    
	    if (!flag) {
	        // Create a new flavor if no matching flavor is found
	        var fname = scenario + "_" + name + "_" + ttuStep
	        
	        // Delete flavor with the same name if it exists
	        i = 0
	        while (!flag && i < fl.size) {
	            if (fl.get(i).name == fname) {
	                cf.flavors.delete(fl.get(i).id)
	                flag = true
	            }
	            i++
	        }
	        
	        var nf = cf.flavors.create(fname, flavor.ram, flavor.vcpu, flavor.disk / 1024, 0, 0, 1.0f, true)
	        flavorId = nf.id
	    }
	    
	    var OSname = VsdlResources.getOsImage(OS)
	    var il = cf.images.list
	    
	    i = 0
	    flag = false
	    while (!flag && i < il.size) {
	        if (il.get(i).name == OSname) {
	            OSid = il.get(i).id
	            flag = true
	        }
	        i++
	    }
	    
	    if (OSid == "") {
	        throw new Exception("Invalid OS for node " + name)
	    }
	    
	    // Generate the Terraform configuration string
	    val builder = new StringBuilder()
	    builder.append("resource openstack_compute_instance_v2" + name + "{")
	    builder.append("\n  name = \"${name}\"")
	    builder.append("\n  image_id = \"${OSid}\"")
	    builder.append("\n  flavor_id = \"${flavorId}\"")
	
	    // Network interfaces configuration
	    if (interfaces !== null && !interfaces.isEmpty()) {
	        for (n : interfaces) {
	            builder.append("\n  network {")
	            builder.append("\n    uuid = \"${openstack_networking_network_v2.${n.networkid}.id}\"")
	            if (n.address !== "") {
	                builder.append("\n    fixed_ip_v4 = \"${n.address}\"")
	            }
	            builder.append("\n  }")
	        }
	    } else {
	        builder.append("\n  network {")
	        builder.append("\n    uuid = \"${openstack_networking_network_v2.bogus.id}\"")
	        builder.append("\n  }")
	    }
	
	    builder.append("\n}")
	
	    return builder.toString()
	}
}