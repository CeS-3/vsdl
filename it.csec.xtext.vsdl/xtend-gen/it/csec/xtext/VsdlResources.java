package it.csec.xtext;

import it.csec.xtext.vsdl.HardwareProfile;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.openstack.OSFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 去掉了 "platform:/plugin/it.csec.xtext.vsdl/..." 的 Eclipse 依赖，
 * 改用 classpath 内的 "/it/csec/xtext/vsdl/resources.xml" 与 config.properties。
 */
@SuppressWarnings("all")
public class VsdlResources {
  /**
   * 读取 resources.xml 的输入流。
   * 
   * 注意：资源文件 "/resources.xml"
   */
  private static InputStream getResourceInputStream() {
    try {
      final String path = "/resources.xml";
      final InputStream stream = VsdlResources.class.getResourceAsStream(path);
      boolean _equals = Objects.equals(stream, null);
      if (_equals) {
        throw new IOException(("Cannot find resource file: " + path));
      }
      return stream;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * 读取 config.properties
   */
  private static Properties getConfig() {
    try {
      final String path = "/config.properties";
      final InputStream input = VsdlResources.class.getResourceAsStream(path);
      boolean _equals = Objects.equals(input, null);
      if (_equals) {
        throw new IOException(("Cannot find config file: " + path));
      }
      final Properties prop = new Properties();
      prop.load(input);
      input.close();
      return prop;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static ArrayList<Integer> getOssFamilyIds(final String family) {
    try {
      final ArrayList<Integer> res = new ArrayList<Integer>();
      final InputStream inputStream = VsdlResources.getResourceInputStream();
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      final Document doc = dBuilder.parse(inputStream);
      final NodeList nList = doc.getElementsByTagName("os");
      int _length = nList.getLength();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final Node nNode = nList.item((i).intValue());
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            final Element eElement = ((Element) nNode);
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
      final InputStream inputStream = VsdlResources.getResourceInputStream();
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      final Document doc = dBuilder.parse(inputStream);
      final NodeList nList = doc.getElementsByTagName("os");
      int i = 0;
      while ((i < nList.getLength())) {
        {
          final Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            final Element eElement = ((Element) nNode);
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
      return (-1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static String getOsImage(final int id) {
    try {
      final InputStream inputStream = VsdlResources.getResourceInputStream();
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      final Document doc = dBuilder.parse(inputStream);
      final NodeList nList = doc.getElementsByTagName("os");
      int i = 0;
      while ((i < nList.getLength())) {
        {
          final Node nNode = nList.item(i);
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            final Element eElement = ((Element) nNode);
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

  public static ArrayList<String> getOssName() {
    try {
      final ArrayList<String> res = new ArrayList<String>();
      final InputStream inputStream = VsdlResources.getResourceInputStream();
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      final Document doc = dBuilder.parse(inputStream);
      final NodeList nList = doc.getElementsByTagName("os");
      int _length = nList.getLength();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final Node nNode = nList.item((i).intValue());
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            final Element eElement = ((Element) nNode);
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

  public static ArrayList<String> getOssFamily() {
    try {
      final ArrayList<String> res = new ArrayList<String>();
      final HashSet<String> hs = new HashSet<String>();
      final InputStream inputStream = VsdlResources.getResourceInputStream();
      final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      final Document doc = dBuilder.parse(inputStream);
      final NodeList nList = doc.getElementsByTagName("os");
      int _length = nList.getLength();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          final Node nNode = nList.item((i).intValue());
          short _nodeType = nNode.getNodeType();
          boolean _equals = (_nodeType == Node.ELEMENT_NODE);
          if (_equals) {
            final Element eElement = ((Element) nNode);
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

  public static String getOSdomain() {
    return VsdlResources.getConfig().getProperty("osdomain");
  }

  public static OSClient.OSClientV3 getOSClient() {
    final Properties prop = VsdlResources.getConfig();
    return OSFactory.builderV3().endpoint(prop.getProperty("openstack_url")).credentials(
      prop.getProperty("openstack_user"), 
      prop.getProperty("openstack_password"), 
      Identifier.byName("Default")).authenticate();
  }

  public static List<? extends Flavor> getFlavors() {
    return VsdlResources.getOSClient().compute().flavors().list();
  }

  public static Flavor getFlavor(final HardwareProfile name) {
    final List<? extends Flavor> fs = VsdlResources.getFlavors();
    for (final Flavor f : fs) {
      boolean _equals = f.getName().equals(name.toString());
      if (_equals) {
        return f;
      }
    }
    return null;
  }

  public static ArrayList<String> getFlavorsName() {
    final ArrayList<String> res = new ArrayList<String>();
    List<? extends Flavor> _list = VsdlResources.getOSClient().compute().flavors().list();
    for (final Flavor f : _list) {
      res.add(f.getName());
    }
    return res;
  }
}
