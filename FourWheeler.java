package InterfacesPrac;

public interface FourWheeler {
	
	int engines = 1;
	int gears = 6;
	public void designType(String name);
	default void getGears() {
		System.out.println("No. of gears: " + gears);
	}
	

}
