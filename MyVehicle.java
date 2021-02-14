package InterfacesPrac;

public class MyVehicle extends Car implements Design, FourWheeler, Vehicle{
	
	

	public MyVehicle() {
//		super(); implicitly still calls to no argument constructor of super class
		
	}

	public static void main(String[] args) {
		System.out.println("Building my vehicle \n");
		MyVehicle myVehicle1 = new MyVehicle();
		MyVehicle myVehicle2 = new MyVehicle();
		myVehicle1.name = "ZeeCar1";
		myVehicle1.designType(myVehicle1.name);
		myVehicle1.getGears();
//		myVehicle.engines = 2;
//		myVehicle.gears = 8;
		MyVehicle.tyres = 5;
		myVehicle2.name = "ZeeCar";
		myVehicle2.designType(myVehicle2.name, 8);
		myVehicle2.getGears();
		System.out.println();
		Design design1 = new MyVehicle(); 
		Design design2 = new School();
		
		design1.getColour();
		design2.getColour();
		showInfo(design1);
		System.out.println();
		
		
		// Inheritance , Object Up casting, down casting
		MyVehicle v1 = new MyVehicle();
//		MyVehicle v2 = new Car(); // need Down - casting
		Car car1 = v1; //Up casting : implicit
		
		Car car2 = new MyVehicle();
		MyVehicle v3 = (MyVehicle)car2; // down casting
		System.out.println("Down casting");
		v3.name = "DownCasting";
		v3.getColour();
		v3.designType(v3.name);
		System.out.println();
		
		System.out.println("Object Calling Way 1");
		MyVehicle sedan = new MyVehicle();
		sedan.getColour();
		System.out.println();
		
		System.out.println("Object Calling Way 2");
//		MyVehicle Maruti = new Car(); // Failed : implicit Down casting not possible.
		System.out.println("Failed : implicit Down casting not possible.");
		System.out.println();
		
		System.out.println("Object Calling Way 3");
		Car luxury = new Car();
//		luxury.getColour(); // cannot directly access getColour method since ref type is Car.
//		((MyVehicle) luxury).getColour(); // Down casted but will give runtime error : base class ref should point to sub-class object before down casting
		System.out.println();
		
		System.out.println("Object Calling Way 4");
		Car economic = new MyVehicle();
//		economic.getColour();  // cannot directly access getColour method since ref type is Car.
		((MyVehicle) economic).getColour(); // Down casted but will give runtime error : base class ref should point to sub-class object before down casting
		System.out.println();
		
		System.out.println("Object Calling Way 5");
		Car intermediate = new MyVehicle();
//		intermediate.getColour();  // cannot directly access getColour method since ref type is Car.
		intermediate.designType("Intermediate"); // Implicit Up casting
		System.out.println();
		
		sedan.designType("Zeenat");
		
		float var1 = 10;
//		int var2 = 20.90;
		
	
	}

	@Override
	public void getColour() {
		System.out.println("vehicle is black");
		
	}

	@Override
	public void getSize() {
		System.out.println("");
		
	}
	
	public static void showInfo(Design design) {
		design.getColour();
	}
	
	public void designType(String name) {
		super.designType(name);
		System.out.println("Hello there " + name);
	}
	
}
