package test;

public class Ifelse6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean tiered=true;
		
		if(!tiered) {
			System.out.println("Increase your energy");
		}
		else {
			System.out.println("Dont waste time");
		}
		
		if(5*2 == 10) {
			System.out.println("Yes");
		}else {
			System.out.println("Nope");
		}
		
		int marks=60;
		if(marks >=95) {
			System.out.println("Grade : A");
		}else if(marks >=80){
			System.out.println("Grade : B");
		}else if(marks >=70) {
			System.out.println("Grade : C");
		}else {
			System.out.println("Cool..");
		}
		
		
		
		int money=100;
		String car="None";
		
		if(money >=80) {
			car="Audi";
		}else if(money >=60) {
			car="Benz";
		}
		else if(money >=50) {
			car="Maruthi";
		}
		System.out.println(car);
		
		
		
		//nested ifelse
		int num=3;
		if(num>=5) {
			if(num>=6) {
				System.out.println("Cooled..");
			}
			else {
				System.out.println("rocked..");
			}
		  }else {
				System.out.println("Shocked..");
		}
		
		//switch case
		int number=10;
		switch(number) {
		case 1: System.out.println("1");
		break;
		case 2:System.out.println("2");
		break;
		default: System.out.println("Not in range");
		}
	}

}
