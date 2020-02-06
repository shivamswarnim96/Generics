package Generics;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		
		GenericConstructor test = new GenericConstructor(100);
		GenericConstructor test2 = new GenericConstructor(123.5F);
		
		test.showval();
		test2.showval();

	}

}