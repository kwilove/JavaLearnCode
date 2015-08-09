package com.hand.Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener03 extends Thread {
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
				ChatSocket03 chatSocket03 = new ChatSocket03(socket);
				chatSocket03.start();
				ChatManager03.getChatManager03().add(chatSocket03);
//				serverSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
