package classesandobjects;

public class SmartPhone {

	String model_name;
	String brand_name;
	int price;
	int screensize_inches;
	String colour;
	
	public void  details() {
		System.out.println("The name is "+model_name);
		System.out.println("The name is "+brand_name);
		System.out.println("The name is "+price);
		System.out.println("The name is "+screensize_inches);
		System.out.println("The name is "+colour);
	}
	public void turnOn() {
		System.out.println("Smart phone is turning On");
	}
	
	public void turnOff() {
		System.out.println("Smart phone is turning Off");
	}
	
	public void call() {
		System.out.println("Smart phone is making call");
	}
}
