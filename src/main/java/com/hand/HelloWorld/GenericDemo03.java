package com.hand.HelloWorld;

class Gen<S,I> {
	private S name;
	private I age;
	public S getName() {
		return name;
	}
	public void setName(S name) {
		this.name = name;
	}
	public I getAge() {
		return age;
	}
	public void setAge(I age) {
		this.age = age;
	}
	
}
public class GenericDemo03 {

	public static void main(String[] args) {
		Gen<String,Integer> g = new Gen<String,Integer>();
		g.setName("张三");
		g.setAge(20);
		System.out.println(g.getName() + "    " + g.getAge());
	}

}
