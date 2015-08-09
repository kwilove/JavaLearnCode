package com.hand.HelloWorld;

interface USB {
	/*
	 * 接口的属性是全局常量 static final，可省略
	 * 接口的方法为抽象方法 public abstract，可省略，不需要方法体，后面加';'分号
	 */
	//整写
	public abstract void start();
	//简写
	void stop();
}

class C {
	public static void work(USB u) {	//参数应用了多态性
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class USBDisk implements USB {

	public void start() {
		System.out.println("U盘开始工作");
	}

	public void stop() {
		System.out.println("U盘停止工作");
	}
}

class printer implements USB {

	public void start() {
		System.out.println("打印机开始工作");
	}

	public void stop() {
		System.out.println("打印机停止工作");
	}
	
}

public class InterDemo {
	
	public static void main(String[] args) {
		C.work(new USBDisk());
		C.work(new printer());
	}

}
