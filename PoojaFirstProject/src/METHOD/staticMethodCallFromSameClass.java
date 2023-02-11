package METHOD;

public class staticMethodCallFromSameClass {
	
public static void main(String[] args) {
	add();
	sub();
	display();
	
}
public static void add() {
	int a=5;
	int b=15;
	System.out.println("add:"+(a+b));
}
public static void sub() {
	int a=100;
	int b=200;
	System.out.println("sub:"+(a-b));
	
}
public static void display() {
	System.out.println("Welcome Software Tester");
}
}
