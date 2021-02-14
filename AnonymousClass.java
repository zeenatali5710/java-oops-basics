package intro;

class Box1 {
	private int length;
	private double height;
	private static final int WIDTH = 5;

	public void Volume(int l, double h) {
		this.length = l;
		this.height = h;
		System.out.println(length * height * WIDTH);
	}
}

interface Circle {
	public void Area();
}

public class AnonymousClass {

	public static void main(String[] args) {
		Box1 box = new Box1() {
			@Override
			public void Volume(int l, double h) {
				System.out.println("I am anonymous");
			}
		};
		box.Volume(10, 4.5);

		Circle circle = new Circle() {
			public void Area() {
				System.out.println("Anonymous Circle");
			}
		};
		circle.Area();

	}
}