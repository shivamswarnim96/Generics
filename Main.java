package Generics;

class Main 
{ 
	public static void main (String[] args) 
	{ 
		// instance of Integer type 
		Test <Integer> iObj = new Test<Integer>(15); 
		System.out.println(iObj.getObject()); 

		// instance of String type 
		Test <String> sObj = new Test<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
      
        Test <Emp> emp = new Test<Emp>(new Emp(5));
        Test <Own> own = new Test<Own>(new Own(10));
      
        System.out.println(emp.getObject().id);
        System.out.println(own.getObject().id);
            
	} 
}