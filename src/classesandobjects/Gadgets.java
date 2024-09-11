package classesandobjects;

public class Gadgets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone phone1;
		
		phone1=new SmartPhone();
		
		phone1.model_name="A-12";
		phone1.brand_name="OPPO";
		phone1.price=12000;
		phone1.screensize_inches=6;
		
		phone1.turnOn();
		phone1.details();
	}

}
