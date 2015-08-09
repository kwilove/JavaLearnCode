package com.hand.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket03 extends Thread {
	Socket socket;

	public ChatSocket03(Socket socket) {
		this.socket = socket;
	}

	public void out(String out) {
		try {
			socket.getOutputStream().write(out.getBytes("UTF-8"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			String line = null;
			while ((line = br.readLine())!=null) {
				ChatManager03.getChatManager03().publish(this, line);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
