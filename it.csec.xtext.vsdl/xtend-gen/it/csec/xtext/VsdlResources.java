package it.csec.xtext;

import it.csec.xtext.vsdl.HardwareProfile;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.openstack.OSFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@SuppressWarnings("all")
public class VsdlResources {
  private static InputStream getResourceInputStream() {
    try {
      URL url = new URL("platform:/plugin/it.csec.xtext.vsdl/resources.xml");
      return url.openConnection().getInputStream();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static List<Integer> getOssFamilyIds(final String family) {
    try {
      List<Integer> res = new ArrayList<Integer>();
      InputStream inputStream = VsdlResources.getResourceInputStream();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputStream);
      NodeList nList = doc.getElementsByTagName("os");
      for (int i = 0; (i < nList.getLength()); i++) {
        {
          Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            Element eElement = ((Element) nNode);
            boolean _equals_1 = eElement.getElementsByTagName("family").item(0).getTextContent().equals(family);
            if (_equals_1) {
              res.add(Integer.valueOf(Integer.parseInt(eElement.getAttribute("id"))));
            }
          }
        }
      }
      inputStream.close();
      return res;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static int getOsId(final String name) {
    try {
      InputStream inputStream = VsdlResources.getResourceInputStream();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputStream);
      NodeList nList = doc.getElementsByTagName("os");
      int i = 0;
      while ((i < nList.getLength())) {
        {
          Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            Element eElement = ((Element) nNode);
            boolean _equals_1 = eElement.getElementsByTagName("name").item(0).getTextContent().equals(name);
            if (_equals_1) {
              inputStream.close();
              return Integer.parseInt(eElement.getAttribute("id"));
            }
          }
          i++;
        }
      }
      inputStream.close();
      return i;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static String getOsImage(final int id) {
    try {
      InputStream inputStream = VsdlResources.getResourceInputStream();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputStream);
      NodeList nList = doc.getElementsByTagName("os");
      int i = 0;
      while ((i < nList.getLength())) {
        {
          Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            Element eElement = ((Element) nNode);
            int _parseInt = Integer.parseInt(eElement.getAttribute("id"));
            boolean _equals_1 = (_parseInt == id);
            if (_equals_1) {
              inputStream.close();
              return eElement.getElementsByTagName("image").item(0).getTextContent();
            }
          }
          i++;
        }
      }
      inputStream.close();
      return "";
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static List<String> getOssName() {
    try {
      List<String> res = new ArrayList<String>();
      InputStream inputStream = VsdlResources.getResourceInputStream();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputStream);
      NodeList nList = doc.getElementsByTagName("os");
      for (int i = 0; (i < nList.getLength()); i++) {
        {
          Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            Element eElement = ((Element) nNode);
            res.add(eElement.getElementsByTagName("name").item(0).getTextContent());
          }
        }
      }
      inputStream.close();
      return res;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static List<String> getOssFamily() {
    try {
      List<String> res = new ArrayList<String>();
      Set<String> hs = new HashSet<String>();
      InputStream inputStream = VsdlResources.getResourceInputStream();
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputStream);
      NodeList nList = doc.getElementsByTagName("os");
      for (int i = 0; (i < nList.getLength()); i++) {
        {
          Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            Element eElement = ((Element) nNode);
            res.add(eElement.getElementsByTagName("family").item(0).getTextContent());
          }
        }
      }
      inputStream.close();
      hs.addAll(res);
      res.clear();
      res.addAll(hs);
      return res;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private static Properties getConfig() {
    try {
      URL url = new URL("platform:/plugin/it.csec.xtext.vsdl/config.properties");
      InputStream input = url.openConnection().getInputStream();
      Properties prop = new Properties();
      prop.load(input);
      input.close();
      return prop;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static String getOSuser() {
    return VsdlResources.getConfig().getProperty("openstack_user");
  }

  public static String getOSpassword() {
    return VsdlResources.getConfig().getProperty("openstack_password");
  }

  public static String getOSurl() {
    return VsdlResources.getConfig().getProperty("openstack_url");
  }

  public static String getOStenant() {
    return VsdlResources.getConfig().getProperty("openstack_tenant_name");
  }

  public static String getSolver() {
    return VsdlResources.getConfig().getProperty("solver");
  }

  public static String getTtu() {
    return VsdlResources.getConfig().getProperty("ttu");
  }

  public static String getTtuStep() {
    return VsdlResources.getConfig().getProperty("ttustep");
  }

  public static OSClient.OSClientV3 getOSClient() {
    Properties prop = VsdlResources.getConfig();
    return OSFactory.builderV3().endpoint(prop.getProperty("openstack_url")).credentials(prop.getProperty("openstack_user"), prop.getProperty("openstack_password"), Identifier.byName("Default")).authenticate();
  }

  public static List<? extends Flavor> getFlavors() {
    return VsdlResources.getOSClient().compute().flavors().list();
  }

  public static Flavor getFlavor(final HardwareProfile name) {
    List<? extends Flavor> fs = VsdlResources.getFlavors();
    int i = 0;
    while ((i < fs.size())) {
      {
        boolean _equals = fs.get(i).getName().equals(name);
        if (_equals) {
          return fs.get(i);
        }
        i++;
      }
    }
    return null;
  }

  public static List<String> getFlavorsName() {
    List<String> res = new ArrayList<String>();
    List<? extends Flavor> _list = VsdlResources.getOSClient().compute().flavors().list();
    for (final Flavor f : _list) {
      res.add(f.getName());
    }
    return res;
  }
}
