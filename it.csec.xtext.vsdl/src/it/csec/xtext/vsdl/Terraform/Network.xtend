package it.csec.xtext.vsdl.Terraform

import org.eclipse.xtend.lib.annotations.Accessors

class Network extends ScenElem {
    @Accessors
    private String address
    @Accessors
    private int netmask
    @Accessors
    private String gwaddress
    @Accessors
    private boolean internet
    @Accessors
    private Router router

    new(String name) {
        this.name = name
        this.address = ""
        this.gwaddress = ""
        this.netmask = 0
        this.internet = false
        router = new Router("rt_" + name)
        router.interfaces.add(0, new Interface(name, ""))
    }

    def static public long2ip(long ip) {
        var o4 = Long.toString(ip.bitwiseAnd(0xff))
        var o3 = Long.toString((ip >> 8).bitwiseAnd(0xff))
        var o2 = Long.toString((ip >> 16).bitwiseAnd(0xff))
        var o1 = Long.toString((ip >> 24).bitwiseAnd(0xff))

        return o1 + "." + o2 + "." + o3 + "." + o4
    }

    def toTerraformString() {
        val builder = new StringBuilder()

        // Network resource
        builder.append("resource \"openstack_networking_network_v2\" \"" + name + "\" {")
        builder.append("\n  name = \"" + name + "\"")
        builder.append("\n  admin_state_up = \"true\"")
        builder.append("\n}\n\n")

        // Subnet resource
        builder.append("resource \"openstack_networking_subnet_v2\" \"subnet_" + name + "\" {")
        builder.append("\n  name = \"subnet_" + name + "\"")
        builder.append("\n  network_id = \"${openstack_networking_network_v2." + name + ".id}\"")
        builder.append("\n  cidr = \"" + address + "/" + netmask + "\"")
        builder.append("\n  ip_version = 4")
        builder.append("\n  dns_nameservers = [\"8.8.8.8\", \"8.8.4.4\"]")
        if (gwaddress !== "") {
            builder.append("\n  gateway_ip = \"" + gwaddress + "\"")
        }
        builder.append("\n}\n\n")

        // Router configuration
        builder.append(router.toTerraformString())

        return builder.toString()
    }
}