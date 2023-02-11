package METHOD;

public class staticMethodwithParameters {
public static void main(String[] args) {
	add(10,20);
	show("Pooja");
	
}
public static void add(int a, int b) {
	System.out.println("add:"+(a+b));
}
public static void show(String msg) {
	System.out.println(msg);
	
}
}
