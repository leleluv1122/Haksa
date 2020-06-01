public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("c1(" + c1.color + ", " + c1.door + ", " + c1.window + ")");

		Car c2 = new Car("red", 2, 5);
		System.out.println("c2(" + c2.color + ", " + c2.door + ", " + c2.window + ")");
		c2.start();
		
		Bus b1 = new Bus();
		System.out.println("b1(" + b1.no + ", " + b1.color
				+ ", " + b1.door + ", " + b1.window + ")");
		
		Bus b2 = new Bus(234);
		System.out.println("b2(" + b2.no + ", " + b2.color
				+ ", " + b2.door + ", " + b2.window + ")");
	
		b1.start(); // 오버라이딩 된 메소드가 호출됨
	}
}
