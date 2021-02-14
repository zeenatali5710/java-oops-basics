/*@author: Ali,Zeenat */
/*
1. main method must be static because JVM needs to access main() before class object is created, also must be public, static, and void.
3. top level classes can only be public. Protected and private classes can be used in nested classes, methods can be private/protected.
4. private can be accessed only within the class. protected can be accessed within class and subclass in same or different package.
5. main method can be overloaded.
6. static variable will enable single copy for all objects/instances.
7. If a constructor is not explicitly defined, it uses default constructor.
*/


import java.util.Scanner;  
class test {
	public test() {}
	static int x = 1; // static variable
	int id = 2; // instance variable
	protected int getId(int id) {
		System.out.println(id);
		int y = 1;// local variable within methods/blocks
		id = id + y;
		javaStruct.main("static");
		return id;
	}
	
}

public class javaStruct extends test{
	public static void main(String args[]){
		javaStruct jS1 = new javaStruct();
		jS1.getId(6); // not using the returned element
		System.out.println("Class is public");
		System.out.println(jS1.id);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		System.out.println(jS1.getId(k));
		//return jS1.getId(7); //return type has to be void for main()
		main("test");
		test t1 = new test();
		t1.x = 4;
		test t2 = new test();
		test t3 = new test();
		t3.x = 5;
		System.out.println(t3.x);
		System.out.println(t2.x);
		System.out.println(t1.x);
		
	}
	//main method can be overloaded
	public static void main(String args) {
		System.out.println(args);
	}
}
