package Generics;

class Wildcard<T extends Number> {
	T[] nums; // array of Number or subclass
	// Pass the constructor a reference to
	// an array of type Number or subclass.
	Wildcard(T[] o) {
		nums = o;
	}
	// Return type double in all cases.
	double average() {
		double sum = 0.0;
		for(int i=0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}
	// Determine if two averages are the same.
	// Notice the use of the wildcard.
	boolean sameAvg(Wildcard<?> ob) {
		System.out.println();
		System.out.println(average());
		System.out.println(ob.average());
		if(average() == ob.average())
			return true;
		return false;
	}
}