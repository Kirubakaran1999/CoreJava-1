package methods;

public class ReturnTypeAndArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=multiply100(2);
		System.out.println(result);
	}

	public static void PrintSomething(String name) {
		System.out.println(name);
	}

	public static void PrintSomething(int age) {
		System.out.println(age);
	}

	public static void multiply(int num1,int num2) {
		System.out.println(num1*num2);
	}
	
	
	
	public static int multiply100(int num) {
		int result=num*100;
		return result;
	}

}