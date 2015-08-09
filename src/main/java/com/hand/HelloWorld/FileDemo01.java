package com.hand.HelloWorld;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");		//new一个File类对象指向指定目录
		if(file.exists()) {
			//是否是文件
			System.out.println("是否是文件：" + file.isFile());
			//是否是目录
			System.out.println("是否是文件夹：" + file.isDirectory());
			//修改文件名
			file.renameTo(new File("abc.txt"));
			//删除文件，删除的是之前名字的文件hello.txt，而不是改名后的abc.txt，故delete（）无法完成删除操作，abc。txt依然存在。
			System.out.println("删除是否成功：" + file.delete());
		}
		else {
			System.out.println("文件不存在");
			try {
				file.createNewFile();	//创建文件
				System.out.println("文件创建成功");
			} catch (IOException e) {
				System.out.println("文件创建失败");
			}
		}
	}

}
