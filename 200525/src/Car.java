public class Car {
	String color; // 3���� �������(�ν��Ͻ�����: ��ü�����ؾ� ���ٰ���)
	int door;
	int window = 0; // 1. ����� �ʱ�ȭ ���

	// 3. �ʱ�ȭ ���� �̿��� �ʱ�ȭ ���
	static { // Ŭ���� �ʱ�ȭ �� ( Ŭ������ ó�� �ε��Ǹ鼭 �� �ѹ� ȣ���)
		System.out.println("Ŭ���� �ʱ�ȭ �� �� 1�� ȣ��˴ϴ�.");
	}

	{ // �ν��Ͻ� �ʱ�ȭ �� ( ��ü ������ �� ���� ȣ���, �����ں��� ���� ����)
		System.out.println("��ü ������ �����ں��� ���� ȣ��Ǿ����ϴ�.");
	}

	// 2. ������ �ʱ�ȭ ���
	Car() { // �⺻������ ( �ʱ�ȭ ���)
		this("black", 4, 4);
		// ������ Car(String color, int door, int window) {} �κ�����
		//  ���ٰ� ���µ�, �ݵ�� this() �������� �ۼ��ؾ� ��...
		System.out.println("Car () ������ �Դϴ�.");
	}
	
	Car(int door) {
		this.door = door; // �Ű������� ��������� ���� ���� this.�� �����
		System.out.println("Car (int door) ������ �Դϴ�.");
	}

	Car(String color, int door, int window) {
		this.color = color;
		this.door = door;
		this.window = window;
		System.out.println("Car (String color, int door, int window) ������ �Դϴ�.");
	}
	// this. �� ��ü�� �ּ�
	// this() ���� Ŭ������ �ٸ� �����ڸ� ȣ��

	void start() { // 2���� ����޼ҵ�(�ν��Ͻ��޼ҵ�: ��ü�����ؾ� ���ٰ���)
		System.out.println("���~");
	}

	void stop() {
		System.out.println("����~");
	}
}
