package com.hand.JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ReadJSON {

	public static void main(String[] args) {

		try {

			// 创建JSON解析器JsonParser对象parser，可以将JSON文件转换为JsonObject对象
			JsonParser parser = new JsonParser();
			// 使用解析器parser的parse（）方法将特定类型的json对象进行转换
			// 该json数据是一个file文件对象，所以parse（）的参数类型为FileReader
			// json文件里的所有数据是存放在一个对象里的，所以先将parse（）转换的数据赋给一个JsonObject对象里，{}对对象，[]为数组
			JsonObject object = (JsonObject) parser.parse(new FileReader("language.json"));
			System.out.println("cat=" + object.get("cat").getAsString());

			JsonArray array = object.get("language").getAsJsonArray();
			for (int i = 0; i < array.size(); i++) {
				JsonObject subobject = array.get(i).getAsJsonObject();
				System.out.print("id=" + subobject.get("id").getAsInt());
				System.out.print("  lan=" + subobject.get("lan").getAsString());
				System.out.println("  ide=" + subobject.get("ide").getAsString());
			}
			
			System.out.println("pop=" + object.get("pop").getAsBoolean());

		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
