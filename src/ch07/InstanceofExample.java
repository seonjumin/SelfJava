package ch07;

public class InstanceofExample {

	public static void personInfo(Person person) {
		System.out.println("name: "+ person.name);
		person.walk();
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
	}
}
