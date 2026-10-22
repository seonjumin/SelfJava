package ch07.ex;

public class Child extends Parent {

	public String name;
	
	public Child() {
		//super();있을 수 없음. 하나의 생성자만 가능.
		this("홍길동");
		System.out.println("Child() call");
	
	}
	
	public Child(String name) {
		//super(); 생략됨
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
