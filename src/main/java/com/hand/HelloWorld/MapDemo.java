package com.hand.HelloWorld;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("zhangsan", 20);
		map.put("lisi", 30);
		map.put("wangwu", 40);
		//通过key获得value
		System.out.println(map.get("lisi"));
		
		//判断某个key是否存在
		if(map.containsKey("zhangsan")) {
			System.out.println("key存在");
		}
		else {
			System.out.println("key不存在");
		}
		//判断某个value是否存在
		if(map.containsValue(400)) {
			System.out.println("value存在");
		}
		else {
			System.out.println("value不存在");
		}
		
		//遍历所有的key,需要使用Set集合存放key
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "   ");
		}
		//遍历所有的value，需要使用Collection存放value
		Collection<Integer> c= map.values();
		Iterator<Integer> iter2 = c.iterator();
		while(iter2.hasNext()) {
			System.out.print(iter2.next() + " ");
		}
	}

}
