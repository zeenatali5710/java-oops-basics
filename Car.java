package InterfacesPrac;

public class Car implements FourWheeler{
	
	static int tyres;
	String name;
	
	Car(){
		System.out.println("I am car constructor");
	}
	
	public void designType(String name) {
		System.out.println(name);
		System.out.println("No. of tyres are: " + tyres);
	}
	
	public void designType(String name, int id) {
		System.out.println(name + id);
		System.out.println("No. of tyres are: " + tyres);
		
	}

}
