package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class utils {
	public static Document document;

	public static  List<List<String>> xmlReading(String filePath) throws ParserConfigurationException, IOException {
		 List<List<String>> mydata1 = new ArrayList<List<String>>();
		 List<String> mydata;
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
		
		//Build Document
		document = builder.parse(new File(filePath));
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = document.getElementsByTagName("user");
		System.out.println(nList.getLength());
		for (int temp = 0; temp < nList.getLength(); temp++)
		{mydata = new ArrayList<String>();
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
	
		 if(node.getNodeType()==Node.ELEMENT_NODE)
		 {	
		    //Print each user's detail
		    Element eElement = (Element) node;
		    System.out.println("user id : "    + eElement.getAttribute("id"));
		    System.out.println("UserName : "  + eElement.getElementsByTagName("username").item(0).getTextContent());
		    System.out.println("Password : "   + eElement.getElementsByTagName("password").item(0).getTextContent());
		    mydata.add(eElement.getElementsByTagName("username").item(0).getTextContent());
		    mydata.add(eElement.getElementsByTagName("password").item(0).getTextContent());
		 }	 
		 mydata1.add(mydata);
		 } 
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mydata1);
		return mydata1;
	}
	
}
