package Constructors;

class Box {
	private double h, w, d;

	double vol() {
		return h * w * d;
	}

	Box() { // if constructor is set to private, object cannot be created
		System.out.println("Initializing Box : deafult constructor");
		this.h = 10; // this keyword can be used in methods also
		this.w = 5;
		this.d = 4;
	}

	Box(double w, double h, double d) {
		System.out.println("Initializing Box : constructor with args");
		this.h = h; // same name: local var and instance var
		this.w = w;
		this.d = d;
	}

	double vol(Boolean b) {
		if (b) {
			System.out.println("Box is symmetrical");
			this.h = 10;
			this.w = 10;
			this.d = 10;
		} else
			System.out.println("Box is asymmetrical");
		return h * w * d;
	}
	
	Box(Box obj){
		h = obj.h;
		w = obj.w;
		d = obj.d;
		System.out.println("I am copy constructor");
	}
}

public class Boxes {

	public static void main(String[] args) {

		Box b1 = new Box();
		double vol = b1.vol();
		System.out.println("Volume1 of Box is: " + vol);
		Box b2 = new Box(20, 50, 3);
		System.out.println("Volume2 is :" + b2.vol());
//		b1.Box(); // compile error since Box() is a constructor and can't be called like a method
		Box b3 = new Box(2, 1, 9);
		System.out.println("Volume3 is :" + b3.vol()); // Constructor using 'this' to define instance variables specific to invoking object
		Box b4 = new Box();
		System.out.println("Volume4 is :" + b4.vol(true)); // Method using 'this' to define instance variables specific to invoking object 
		Box b5 = new Box(b1); // Using copy constructor
		System.out.println("Volume5 is :" + b5.vol()); 
	}

}
