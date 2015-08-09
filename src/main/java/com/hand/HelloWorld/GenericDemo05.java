package com.hand.HelloWorld;

interface Gen<T> {
	public abstract void tell();
}

class Gin1<String> implements Gen<String> {

	private String info;
	
	public Gin1(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public void tell() {

	}

}
public class GenericDemo05 {

	public static void main(String[] args) {
		Gin1 g = new Gin1("学习java打泛型接口");
		System.out.println(g.getInfo());
	}

}
