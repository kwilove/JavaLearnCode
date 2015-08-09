package com.hand.HTTP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostDemo {

	public static void main(String[] args) {
		
		new ReadByPost().start();
		
	}

}

class ReadByPost extends Thread {

	@Override
	public void run() {
	
		try {
			
			//打开URL
			URL url = new URL("http://www.baidu.com");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("POST");
			connection.setRequestProperty("encoding", "UTF-8");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			
			//向URL发送信息
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("");		//此处write（）方法的参数是想URL传递的参数信息，？之后的name=value
			bw.flush();
			
			//获取从URL发回的响应信息
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			StringBuffer sbf = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sbf.append(line);
			}
			
			//关闭输入流、输出流
			br.close();
			isr.close();
			is.close();
			bw.close();
			osw.close();
			os.close();
			
			System.out.println(sbf.toString());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
