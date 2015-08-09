package com.hand.HelloWorld;

class Info<T> {
	private T info;

	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}	
	/**
	 * @describe 在类中重写toString（）方法可以定义类对象的输出信息
	 * 			   当print该类对象时调用toString（）输出方法内的信息.
	 */
	public String toString() {
		return this.getInfo().toString();
	}
}

public class GenericDemo04 {

	public static void main(String[] args) {
		Info<String> i= new Info<String>();
		i.setInfo("学习java泛型中的通配符");
		tell(i);
	}
	/**
	 * @descrube tell方法参数的类型使用了通配符‘？’，可以适应任何数据类型.
	 * @param i
	 */
	public static void tell(Info<?> i) {
		//当我们进行输出时，java会自动调用toString()方法输出指定参数
		System.out.println(i);
	}

}
