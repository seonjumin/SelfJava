package ch07;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) {
		super(model,color);
//		this.model = model;
//		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
	
	@Override
	public double areaCircle(double r) {
		return Math.PI * r * r;
	}
}
