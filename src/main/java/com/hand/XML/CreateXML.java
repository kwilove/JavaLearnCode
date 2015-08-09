package com.hand.XML;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {

	public static void main(String[] args) throws TransformerConfigurationException {
		try {
			// 创建XML
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			Element root = document.createElement("language");
			root.setAttribute("cat", "IT");
			Element lan = document.createElement("lan");
			lan.setAttribute("id", "1");
			Element name = document.createElement("name");
			name.setTextContent("JAVA");
			Element ide = document.createElement("ide");
			ide.setTextContent("Eclipse");

			lan.appendChild(name);
			lan.appendChild(ide);
			root.appendChild(lan);
			document.appendChild(root);

			// --------------------------------------------------------------

			// 输出XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			StringWriter sw = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(sw)); // StreamResult输出流
			System.out.println(sw);

			transformer.transform(new DOMSource(document), new StreamResult(new File("language2.xml"))); // 文件输出

		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}

	}
	
	public static void transformXML(String xml) {
		
	}

}
