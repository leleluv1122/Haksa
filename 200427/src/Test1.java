// ��ü�������α׷��� Ư¡
// 1. ĸ��ȭ
// 2. ���
// 3. ������

// Ŭ������ ������ �޼ҵ�� �̷��������
// Ű���� class �� �ۼ��ϰ� �� �ڿ� Ŭ������ ���� (Ŭ�������� �빮�� ����)

// �⺻��: �ڹٴ� 8��
// ������: Ŭ�������� ��� ������ (Test1, String, System ��)
//		  �������� �ּҸ� ������ �� �ִ� Ÿ������ ���������� ����� 4byte��!!

// public�� ���������ڷ� ��� Ŭ�������� ���� ����!
public class Test1 { // extends Object { // Test1 Ŭ���� ����
	public static void main(String[] args) { // ���� �޼ҵ� (���α׷� ������ġ) ����
		// int n = 10; // �������� ���� �� �ʱ�ȭ
		Car c1 = new Car(); // c1 ��ü(�ν��Ͻ�) ����
		Car c2 = new Car();

		c1.color = "������"; // = new String("������");
		c1.door = 4;
		System.out.println("c1�� ������ " + c1.color + "�Դϴ�.");
		System.out.println("c1�� ���� ������ " + c1.door + "�� �Դϴ�.");
		c1.start();
		c1.stop();

		c2.color = "�Ķ���";
		c2.door = 2;
		System.out.println("c2�� ������ " + c2.color + "�Դϴ�.");
		System.out.println("c2�� ���� ������ " + c2.door + "�� �Դϴ�.");
		c2.start();
		c2.stop();
	}
}
