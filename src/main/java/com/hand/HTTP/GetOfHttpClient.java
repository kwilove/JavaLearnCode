package com.hand.HTTP;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/*
 * 使用HttpClient提供的Get方法获取网络数据
 * 1、定义一个 HttpClient 类的实例化对象 client ，	HttpClients.createDefault();
 * 2、定义一个 HttpGet 类的实例化对象 get ，将访问的 URL 作为构造方法的参数
 * 3、使用 client 的 execute（） 方法执行get对象，get作为方法的参数，返回一个 HttpResponse 类型的响应对象 response
 * 4、response 调用自己的 getEntity() 方法将响应对象转换成消息实体，返回值为 HttpEntity 类型
 * 5、调用 toString（）方法将消息实体转换成指定编码的String类型，两个参数为 HttpEntity的对象，和编码格式。
 */

public class GetOfHttpClient {

	public static void main(String[] args) {
		new ReadByHttpGet().start();
	}

}

class ReadByHttpGet extends Thread {

	// 创建一个HttpClient对象
	HttpClient client = HttpClients.createDefault();

	@Override
	public void run() {

		String url = "http://fanyi.youdao.com/openapi.do"
				+ "?keyfrom=kwilove&key=314187409&type=data&doctype=json&version=1.1&q=welcome";
		HttpGet get = new HttpGet(url); // 定义HttpGet对象访问URL
		try {

			HttpResponse response = client.execute(get); // 执行get,获取响应
			HttpEntity entity = response.getEntity(); // 从响应response中获取消息实体
			String result = EntityUtils.toString(entity, "UTF-8"); // 将实体entity转换为指定编码的字符串

			System.out.println(result);

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}