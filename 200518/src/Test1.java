public class Test1 {
	public static void main(String[] args) {
		int n = 5;
		Car c1 = new Car();
		System.out.println("c1 door : " + c1.door);
		System.out.println("c1 window : " + c1.window);
		System.out.println("c1 color : " + c1.color);
		
		Car c2 = new Car(3);
		System.out.println("c2 door : " + c2.door);
		System.out.println("c2 window : " + c2.window);
		System.out.println("c2 color : " + c2.color);
		
		Car c3 = new Car(2, 10, "yellow");
		System.out.println("c3 door : " + c3.door);
		System.out.println("c3 window : " + c3.window);
		System.out.println("c3 color : " + c3.color);
	}
}
