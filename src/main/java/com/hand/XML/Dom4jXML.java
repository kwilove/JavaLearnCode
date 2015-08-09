package com.hand.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

/*
 * 使用dom4j对xml文本进行处理，相对于java API自带的DOM方法要简单很多
 */

public class Dom4jXML {

	public static void main(String[] args) {
		String xml = "<?xml version='1.0' encoding='UTF-8' standalone='no'?><language cat='IT'><lan id='1'><name>JAVA</name><ide>Eclipse</ide></lan></language>";
		try {
			Document document = DocumentHelper.parseText(xml);	//此处的Document类是来自于dom4j包的，选择是要注意
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
