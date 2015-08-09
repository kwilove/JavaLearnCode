package com.hand.HelloWorld;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 集合Set与List的区别在于Set不可以加入重复元素，但是可以使用其子类TreeSet进行自然排序.
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<String> s = null;
		//散列存放
		s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("c");		//重复添加"c"元素
		System.out.println(s);
		//有序存放
		s = new TreeSet<String>();
		s.add("b");
		s.add("e");
		s.add("a");
		s.add("c");
		s.add("d");
		s.add("c");		//重复添加"c"元素
		System.out.println(s);
	}

}
