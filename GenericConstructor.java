package Generics;

class GenericConstructor {
	
	private double val;
	
	<T extends Number> GenericConstructor(T arg) {
		val = arg.doubleValue();
	}
	
	void showval() {
		System.out.println("val: " + val);
	}
	
}