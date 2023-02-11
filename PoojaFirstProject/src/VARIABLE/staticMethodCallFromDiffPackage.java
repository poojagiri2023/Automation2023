package VARIABLE;

import METHOD.staticMethodCallFromSameClass;

public class staticMethodCallFromDiffPackage {
public static void main(String[] args) {
	staticMethodCallFromSameClass.add();
	staticMethodCallFromSameClass.sub();
	staticMethodCallFromSameClass.display();
}
}
