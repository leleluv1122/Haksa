class Shape {
	int x;
	int y;

	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	double r;

	Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10, 20, 3.4);
		Rectangle r1 = new Rectangle(20, 30, 5, 10);

		System.out.println("c1ÀÇ x: " + c1.x + ", y: " + c1.y + ", r: " + c1.r);
		System.out.println("r1ÀÇ x: " + r1.x + ", y: " + r1.y + ", width: " + r1.width + ", height: " + r1.height);
	}
}