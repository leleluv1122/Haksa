public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car(); // �⺻�����ڷ� �ʱ�ȭ
		System.out.println(c1.color + ", " + c1.door + ", " + c1.window);
		
		Car c2 = new Car(5); // �Ű����� �ִ� �����ڷ� �ʱ�ȭ
		System.out.println(c2.color + ", " + c2.door + ", " + c2.window);
		
		Car c3 = new Car("pink", 2, 10); // �Ű����� �ִ� �����ڷ� �ʱ�ȭ
		System.out.println(c3.color + ", " + c3.door + ", " + c3.window);
		
		
	}
}
