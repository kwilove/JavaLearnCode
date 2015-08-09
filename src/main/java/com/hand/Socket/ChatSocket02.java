package com.hand.Socket;

import java.io.IOException;
import java.net.Socket;

public class ChatSocket02 extends Thread {
	Socket socket;

	public ChatSocket02(Socket socket) {
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
		int count = 0;
		while (true) {
			out("count=" + count);
			count++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
