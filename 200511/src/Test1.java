public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car(); // c1 ��ü ����

		c1.door = 2;
		Car.door = 4;
		
		System.out.println("c1�� door�� " + Car.door + "�� �Դϴ�.");
		
		c1.start(); // �ν��Ͻ� �޼ҵ� ȣ�� (��ü ���� �ʼ�)
		Car.stop(); // Ŭ���� �޼ҵ� ȣ�� (��ü���� or Ŭ������ ���� ���ٰ���)
	}
}