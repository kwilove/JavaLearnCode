package com.hand.XML;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("language.xml");
			
			Element root = document.getDocumentElement(); 		// 获取文档根元素
			NodeList ls = root.getElementsByTagName("lan"); 	// 获取所有<lan>元素
			for (int i = 0; i < ls.getLength(); i++) {
				Element lan = (Element) ls.item(i); 		// 获取单个<lan>元素
				System.out.println("id=" + lan.getAttribute("id"));
				NodeList cls = lan.getChildNodes(); 		// 获取<lan>元素下的所有子元素:<name>和<ide>
				for (int j = 0; j < cls.getLength(); j++) {
					Node c = cls.item(j);
					if (c instanceof Element) {
						// System.out.print(j+" ");
						System.out.println(c.getNodeName() + "=" + c.getTextContent());
					}
				}
				System.out.println();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
