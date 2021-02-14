package InterfacesPrac;

class UseStatic {

}

public class StusyStatic {

	static int a = 3;
	static int b;

	static void math(int x) {
		System.out.println("x=" + x);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	static {
		System.out.println("Sttaic block initialized");
		b = a + 4;
	}

	public static void main(String[] args) {

		math(42);
	}

}
