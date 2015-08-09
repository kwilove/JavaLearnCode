package com.hand.Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener02 extends Thread {
	@Override
	public void run() {
		try {
			ServerSocket serverSocket = new ServerSocket(1234);
			while (true) {
				// block
				Socket socket = serverSocket.accept();
				// 建立连接
				JOptionPane.showMessageDialog(null, "有用户访问了本机的1234端口");
				// 将socket传递给新的线程
				new ChatSocket02(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
