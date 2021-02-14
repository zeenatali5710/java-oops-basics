package intro;

public class App {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle();
		Car car = new Car();
		
		Vehicle vehicle2 = car;
		
		vehicle2.design();
		car.ride();
//		vehicle2.ride();
		
		createDesign(car);		
	}
	
	public static void createDesign(Vehicle vehicle) {
		
		vehicle.design();
	}
	
}



class Vehicle {

	public void design() {
		System.out.println("Vehicle design");
	}
}


class Car extends Vehicle {

	@Override
	public void design() {
	System.out.println("Car design");
	}
	
	public void ride() {
		
		System.out.println("Riding the car");
	}

}

