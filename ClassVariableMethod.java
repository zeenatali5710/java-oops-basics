/*
@author zeenat ali Jan 19, 2021
Understand concepts of Class, Variable and method  
 */

class ClassVariableMethod1 {
	int k = 2; //instance variable
	public void getId(int Id) {
		int l = 3;
		int result = Id+k+l;
		System.out.println("Id is:" +result);
	}

}

class ClassVariableMethod2 {

}

public class ClassVariableMethod {
	public static void main(String[] args) {
		System.out.println("test");
		int[] a = { 3, 2, 4 };
		intro.ArrayOperatorLoops obj = new intro.ArrayOperatorLoops();
		System.out.println(obj.sumOfArray(a)); // accessing public method using object of different class
		System.out.println(intro.ArrayOperatorLoops.avgOfArray(a)); // accessing static method using class name
		javaStruct.main("access public class using package"); // accessing public method from class of different package
		ClassVariableMethod1 CVM1 = new ClassVariableMethod1();
		CVM1.k = 5; // 
		CVM1.getId(5); //public method
		
	}

}
