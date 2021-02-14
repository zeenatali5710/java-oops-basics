package intro;

public class Box extends Square {

	private String colour = "red";
	static final String COLOUR = "blue";

	void setColour(String col) {
		colour = "purple";
		System.out.println("Accessing private members from member function:" + colour);
		this.colour = col;
	}

	@Override
	void Area() {
		System.out.println("Colour of square1 is :" + colour);
		System.out.println("Colour of square2 is :" + COLOUR);
		System.out.println("From Box class: method Area");
	}

	void Volume() {
		System.out.println("From Boxclass: method Volume");
	}
}
