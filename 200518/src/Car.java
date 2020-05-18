// import java.lang.*; // java.lang ��Ű�� ���� ��� Ŭ������ import��
// ���� �� ���� ���� ���� (������ �����Ϸ��� �ڵ����� ���� 1���� �߰�����)

// Object Ŭ������ �ڹ��� �ְ� ���� Ŭ����
// Ŭ���� ���ǽ� extends�� ������� ������ �ڵ����� extends Object �� �߰�
public class Car extends Object { // Car Ŭ���� ����
	// ��������� �ʱ�ȭ������ ������ �⺻������ ����
	// (������ 0,  �Ǽ��� 0.0, �������� null, boolean�� false)
	// 3���� �������
	int door; // static�� ������ �ν��Ͻ� ���� (��ü �����Ͽ� ���� ������)
	int window;
	String color;

	// ������: Ŭ������� ���� (����� �ʱ�ȭ ���)
	// �⺻ ������: �Ű������� ����
	// �Ű������ִ� ������: �Ű������� ����
	// �����ڴ� Ŭ�������� 1���̻� �־�� ��! 
	// (��, �����ڰ� 1���� ���� ��쿡�� �����Ϸ��� �ڵ����� Car() { } �� �߰��� ��
	Car() { // �⺻ ������
		door = 4;
		window = 5;
		color = "black";
	}
	
	Car(int door){ // �Ű����� �ִ� ������
		this(3,5,"yellow"); // this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ����!
		// this()�� �ݵ�� ���� ù��° �ٿ� ���;� ��!
	}
	
	Car(int door, int window, String color){
		this.door = door;
		this.window = window;
		this.color = color;
	}

	// 2���� ����޼ҵ�
	void start() { // static�� ������ �ν��Ͻ� �޼ҵ� (��ü �����Ͽ� ���� ������)
		System.out.println("���~~");
	}

	void stop() {
		System.out.println("����~~");
	}
}
