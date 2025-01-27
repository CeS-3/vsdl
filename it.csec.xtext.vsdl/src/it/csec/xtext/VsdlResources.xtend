package it.csec.xtext

import java.io.IOException
import java.io.InputStream
import java.net.URL
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Properties
import java.util.Set

import javax.xml.parsers.DocumentBuilderFactory

import org.openstack4j.model.common.Identifier
import org.openstack4j.model.compute.Flavor
import org.openstack4j.openstack.OSFactory
import org.w3c.dom.Element
import org.w3c.dom.Node

import it.csec.xtext.vsdl.HardwareProfile

/**
 * 去掉了 "platform:/plugin/it.csec.xtext.vsdl/..." 的 Eclipse 依赖，
 * 改用 classpath 内的 "/it/csec/xtext/vsdl/resources.xml" 与 config.properties。
 */
class VsdlResources {

    /**
     * 读取 resources.xml 的输入流。
     * 
     * 注意：资源文件 "/resources.xml" 
     */
    private static def getResourceInputStream() {
        val path = "/resources.xml"
        val stream = typeof(VsdlResources).getResourceAsStream(path)
        if (stream == null) {
            throw new IOException("Cannot find resource file: " + path)
        }
        return stream
    }

    /**
     * 读取 config.properties
     */
    private static def getConfig() {
        val path = "/config.properties"
        val input = typeof(VsdlResources).getResourceAsStream(path)
        if (input == null) {
            throw new IOException("Cannot find config file: " + path)
        }
        val prop = new Properties
        prop.load(input)
        input.close
        return prop
    }

    // -----------------------------------
    // 以下方法基本逻辑不变，只把原先 platform:/plugin/... 改为使用 getResourceInputStream()
    // -----------------------------------

    static def getOssFamilyIds(String family) {
        val res = new ArrayList<Integer>()
        val inputStream = getResourceInputStream

        val dbFactory = DocumentBuilderFactory.newInstance
        val dBuilder = dbFactory.newDocumentBuilder
        val doc = dBuilder.parse(inputStream)

        val nList = doc.getElementsByTagName("os")
        for (i : 0..<(nList.length)) {
            val nNode = nList.item(i)
            if (nNode.nodeType == Node.ELEMENT_NODE) {
                val eElement = nNode as Element
                if (eElement.getElementsByTagName("family").item(0).textContent.equals(family)) {
                    res.add(Integer.parseInt(eElement.getAttribute("id")))
                }
            }
        }
        inputStream.close
        return res
    }

    static def getOsId(String name) {
        val inputStream = getResourceInputStream
        val dbFactory = DocumentBuilderFactory.newInstance
        val dBuilder = dbFactory.newDocumentBuilder
        val doc = dBuilder.parse(inputStream)

        val nList = doc.getElementsByTagName("os")
        var i = 0
        while (i < nList.length) {
            val nNode = nList.item(i)
            if (nNode.nodeType == Node.ELEMENT_NODE) {
                val eElement = nNode as Element
                if (eElement.getElementsByTagName("name").item(0).textContent.equals(name)) {
                    inputStream.close
                    return Integer.parseInt(eElement.getAttribute("id"))
                }
            }
            i++
        }
        inputStream.close
        return -1 // 如果没找到就返回 -1（或者自行处理）
    }

    static def getOsImage(int id) {
        val inputStream = getResourceInputStream
        val dbFactory = DocumentBuilderFactory.newInstance
        val dBuilder = dbFactory.newDocumentBuilder
        val doc = dBuilder.parse(inputStream)

        val nList = doc.getElementsByTagName("os")
        var i = 0
        while (i < nList.length) {
            val nNode = nList.item(i)
            if (nNode.nodeType == Node.ELEMENT_NODE) {
                val eElement = nNode as Element
                if (Integer.parseInt(eElement.getAttribute("id")) == id) {
                    inputStream.close
                    return eElement.getElementsByTagName("image").item(0).textContent
                }
            }
            i++
        }
        inputStream.close
        return ""
    }

    static def getOssName() {
        val res = new ArrayList<String>()
        val inputStream = getResourceInputStream
        val dbFactory = DocumentBuilderFactory.newInstance
        val dBuilder = dbFactory.newDocumentBuilder
        val doc = dBuilder.parse(inputStream)

        val nList = doc.getElementsByTagName("os")
        for (i : 0..<(nList.length)) {
            val nNode = nList.item(i)
            if (nNode.nodeType == Node.ELEMENT_NODE) {
                val eElement = nNode as Element
                res.add(eElement.getElementsByTagName("name").item(0).textContent)
            }
        }
        inputStream.close
        return res
    }

    static def getOssFamily() {
        val res = new ArrayList<String>()
        val hs = new HashSet<String>()

        val inputStream = getResourceInputStream
        val dbFactory = DocumentBuilderFactory.newInstance
        val dBuilder = dbFactory.newDocumentBuilder
        val doc = dBuilder.parse(inputStream)

        val nList = doc.getElementsByTagName("os")
        for (i : 0..<(nList.length)) {
            val nNode = nList.item(i)
            if (nNode.nodeType == Node.ELEMENT_NODE) {
                val eElement = nNode as Element
                res.add(eElement.getElementsByTagName("family").item(0).textContent)
            }
        }
        inputStream.close

        hs.addAll(res)
        res.clear
        res.addAll(hs)
        return res
    }

    // -------------------------------
    // config.properties 对应的属性
    // -------------------------------

    static def getOSuser() {
        return getConfig.getProperty("openstack_user")
    }

    static def getOSpassword() {
        return getConfig.getProperty("openstack_password")
    }

    static def getOSurl() {
        return getConfig.getProperty("openstack_url")
    }

    static def getOStenant() {
        return getConfig.getProperty("openstack_tenant_name")
    }

    static def getSolver() {
        return getConfig.getProperty("solver")
    }

    static def getTtu() {
        return getConfig.getProperty("ttu")
    }

    static def getTtuStep() {
        return getConfig.getProperty("ttustep")
    }

    static def getOSdomain() {
        return getConfig.getProperty("osdomain")
    }

    // -------------------------------
    // OpenStack 客户端相关
    // -------------------------------

    static def getOSClient() {
        val prop = getConfig
        return OSFactory.builderV3()
            .endpoint(prop.getProperty("openstack_url"))
            .credentials(
                prop.getProperty("openstack_user"),
                prop.getProperty("openstack_password"),
                Identifier.byName("Default")
            )
            .authenticate()
    }

    static def getFlavors() {
        return getOSClient.compute.flavors.list
    }

    static def getFlavor(HardwareProfile name) {
        val fs = getFlavors
        for (f : fs) {
            if (f.name.equals(name.toString)) {
                return f
            }
        }
        return null
    }

    static def getFlavorsName() {
        val res = new ArrayList<String>()
        for (Flavor f : getOSClient.compute.flavors.list) {
            res.add(f.name)
        }
        return res
    }
}
