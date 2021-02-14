package InterfacesPrac;

class Circle{
	static final float pi = 3.14f;
	float cost;
	float radius;
	float area() {
		return pi*radius*radius;
	}
	float cost() {
		return cost* area(); // instance method invoked by another instance method
	}
	void showArea(float area) {
		System.out.println("Area is:" + area);
	}
}

public class Concepts {
	
	
	public static void vaArgDemo(int...v) { // Variable length argument
		System.out.println("No. of arguments: " + v.length);
		for(int x:v) {
			System.out.print(x+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c1 = new Circle();
		c.cost = 100; // implicit type conversion : int is promoted to float
//		c1.cost = 100.789 // double cannot be implicitly promoted to float, down casting needed as shown in next line
		c1.cost = (float)100.789; // down casting (narrowing)
		c.radius = 5;
		c1.radius = (float)4.999; // down casting (narrowing)
		float cost = c.cost();
		System.out.println(cost);
		System.out.println(c1.cost());
		c1.showArea(100); //method overloading + up casting (widening)
		System.out.println();
		vaArgDemo();
		vaArgDemo(10);
		vaArgDemo(4, 5, 8); // Variable length argument
	}

}
