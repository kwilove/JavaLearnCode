package com.hand.HTTP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class PostOfHttpClient {

	public static void main(String[] args) {
//		 new ReadByPost().start();
		new ReadByHttpPost().start();
	}

}

class ReadByHttpPost extends Thread {

	// 创建一个HttpClient对象
	HttpClient client = HttpClients.createDefault();

	@Override
	public void run() {

		String url = "http://fanyi.youdao.com/openapi.do";
		// +"?keyfrom=kwilove&key=314187409&type=data&doctype=xml&version=1.1&q=welcome";
		HttpPost post = new HttpPost(url); // 定义HttpPost对象访问URL
		try {

			List<BasicNameValuePair> parameters = new ArrayList<>();
			parameters.add(new BasicNameValuePair("keyfrom", "kwilove"));
			parameters.add(new BasicNameValuePair("key", "314187409"));
			parameters.add(new BasicNameValuePair("type", "data"));
			parameters.add(new BasicNameValuePair("doctype", "xml"));
			parameters.add(new BasicNameValuePair("version", "1.1"));
			parameters.add(new BasicNameValuePair("q", "welcome"));

			post.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));

			HttpResponse response = client.execute(post); // 执行post,获取响应
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
