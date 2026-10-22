package ch07;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
		
		System.out.println(myPhone.areaCircle(10.0));
	}

}
