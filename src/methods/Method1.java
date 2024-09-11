package methods;

public class Method1 {
public static void main(String[] args) {
	System.out.println("Hello World");
	//println is a method
	printSomething();  //method calling
	add(1,2,"Gundan");
}

public static void printSomething( ) {
	System.out.println("Something");
}

public static void add(int a,int b,String s) {
	System.out.println(a+b);
	System.out.println("Name : "+s);
}
}
