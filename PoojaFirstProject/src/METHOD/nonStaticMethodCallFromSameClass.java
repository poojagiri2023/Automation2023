package METHOD;

public class nonStaticMethodCallFromSameClass {
	public static void main(String[] args) {
		nonStaticMethodCallFromSameClass n=new nonStaticMethodCallFromSameClass();
		n.sub();
		
	}
	public void sub() {
		int a=5;
		int b=15;
		System.out.println("sub:"+(a-b));
		
	}
	public void jio() {
		System.out.println("honesty is the best policy");
		
	}

}
