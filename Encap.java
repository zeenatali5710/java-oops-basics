package intro;

public class Encap {

	public static void main(String[] args) {
		Box box = new Box();
		Box box1 = new Box();
		Box box2 = new Box();
		box.Area();
//		box1.COLOUR = "green"; 
//		box2.COLOUR = "yellow";
		
		box1.setColour("magenta");
		box1.Area();
		System.out.println(Boolean.TYPE);
		
	}

}
