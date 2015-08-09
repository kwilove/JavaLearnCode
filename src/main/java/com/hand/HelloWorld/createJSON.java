package com.hand.HelloWorld;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class createJSON {

	public static void main(String[] args) {

		// 开始创建JSON对象

		JsonObject object = new JsonObject();

		object.addProperty("cat", "IT");

		JsonArray array = new JsonArray();
		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("lan", "JAVA");
		lan1.addProperty("ide", "Eclipse");
		array.add(lan1);
		JsonObject lan2 = new JsonObject();
		lan2.addProperty("id", 2);
		lan2.addProperty("lan", "PHP");
		lan2.addProperty("ide", "EPP");
		array.add(lan2);
		JsonObject lan3 = new JsonObject();
		lan3.addProperty("id", 3);
		lan3.addProperty("lan", "C#");
		lan3.addProperty("ide", "Visual Studio");
		array.add(lan3);
		object.add("language", array);

		object.addProperty("pop", true);

		// JSON对象创建完成

		System.out.println(object.toString());

	}

}
