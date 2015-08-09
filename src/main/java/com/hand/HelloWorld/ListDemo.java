package com.hand.HelloWorld;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		int pos;
		List<String> ls = null;
		ls = new ArrayList<String>();
		System.out.println("集合是否为空：" + ls.isEmpty());
		ls.add("World");
		ls.add(0, "Hello");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		ls.remove(1);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		System.out.println("集合是否为空：" + ls.isEmpty());
		System.out.println("‘Hello’的位置：" + ls.indexOf("Hello"));
		System.out.println("‘java’的位置：" + (( pos = ls.indexOf("java")) == -1?"不存在":pos));

	}

}
