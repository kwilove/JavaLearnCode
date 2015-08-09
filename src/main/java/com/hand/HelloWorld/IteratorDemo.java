package com.hand.HelloWorld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("B");
		ls.add("A");
		ls.add("E");
		ls.add("C");
		ls.add("D");
		//集合输出的标准做法是使用Iterator接口
		Iterator<String> iter = ls.iterator();
		while(iter.hasNext()) {		//判断是否存在元素可以迭代
			String str = iter.next();
			if("C".equals(str)) {
				iter.remove();
			}
			else {
				System.out.println(str);
			}
		}
		while(iter.hasNext()) {		//判断是否存在元素可以迭代
			System.out.println(iter.next());
		}
	}
}
