package com.hand.HelloWorld;

class Con<TYPE> {
	private TYPE value;
	public Con(TYPE value) {
		this.value = value;
	}
	public TYPE getValue() {
		return value;
	}
	public void setValue(TYPE value) {
		this.value = value;
	}
	
}

public class GenericDemo02 {

	public static void main(String[] args) {
		Con<String> c = new Con<String>("这是一个泛型构造函数");
		System.out.println(c.getValue());
	}

}
