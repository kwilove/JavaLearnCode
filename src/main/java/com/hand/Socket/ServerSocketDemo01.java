package com.hand.Socket;

import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JOptionPane;

public class ServerSocketDemo01 {

	public static void main(String[] args) {
		try {
			
			new ServerSocket(1234).accept();		//ServerSocket类构造方法的参数是端口号，1-65535
													//ServerSocket的accept()方法用于监听本机1234号端口的状态
													//如果无人访问1234号端口，程序将一直在此阻塞。
			JOptionPane.showMessageDialog(null, "有用户访问了本机的1234端口");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
