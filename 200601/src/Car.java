// �ڹ��� �ְ� ���� Ŭ������ Object
// Ŭ���� ���ǽ� �ڿ� extends Class���� ������ �����Ϸ��� �ڵ����� extends Object�� �߰�����
public class Car {
	String color;
	int door;
	int window;
	
	Car(){ // �⺻ ������
		this("black", 4, 4); // ���� Ŭ������ �ٸ� �����ڸ� ȣ��
	}
	
	Car(String color, int door, int window){ // �Ű����� �ִ� ������
		super();
		this.color = color;
		this.door = door;
		this.window = window;
	}
	
	void start() {
		System.out.println("���~");
	}
	void stop() {
		System.out.println("����~");
	}
}
