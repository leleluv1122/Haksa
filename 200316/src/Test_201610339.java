// �� �� �ּ�
/* 
����
��
�ּ� 
*/

public class Test_201610339 { // Test_201610339 : Ŭ���� ����
	// ���θ޼ҵ� (���α׷� ���� ��ġ, �� 1���� ����)
	public static void main(String[] args) {
		// �⺻�� (Ÿ��) 8��
		// ���� (1���� ���� ����) - char (1byte)
		// True/False�� ���� ���� - boolean (1byte)
		// ���� - byte(1byte)
		// ���� - short(2byte)
		// ���� - int(4byte) - ���� �⺻ Ÿ��
		// ���� - long(8byte)
		// �Ǽ� - float(4byte)
		// �Ǽ� - double(8byte) - �Ǽ� �⺻ Ÿ��
		
		int n = 10; //���� n�� ����� ���ÿ� �ʱ�ȭ
		int n2 = 100;
		int n3; // ���� n3�� ����(�ʱⰪ�� ���� �ʾұ� ������ ����� �����Ⱚ)		
		n3 = 200; // 200�� n3�� ����
		
		double b1 = 12.3; //���߼��� (���� �߰��� ���� ���� ����)
		float b2 = 12.5f; // 12.5F; f�� �ٿ���� float
		// ū(double)�ʿ��� ������(float) ���� ���ս��� �� �� �־ error���� ����ȯ�ؾߵ�
		
		long n4 = 123L; // �����ʿ��� ū��(int->long)�϶��� error�ȳ���
		// ���̻� L, l�� �ٿ��� ��� ����
		
		char ch = 'a'; // ���� 1���� ���尡���� ch���� ���� �� �ʱ�ȭ
		char ch2 = '5'; // ""�� ���ڿ��̶� ''�� ����
		// 'abc' error
		
		boolean bo = true; // boolean Ÿ���� �������� 
		bo = false; // ture �Ǵ� false �� ���� ����!
		
		System.out.println("�ȳ��ϼ���."); // �ܼ�â�� ���ڿ� ��� (�������� �ٹٲ�)
		System.out.print("�ȳ��ϼ���."); // �ܼ�â�� ���ڿ� ��� (�������� �ٹٲ�X)
		System.out.println(); //�ٹٲ�
		System.out.println("\n�ٹٲ��� �߽��ϴ�.");
		
		System.out.println("n = " + n + "�Դϴ�.");
		System.out.println("b2 = " + b2 + "�Դϴ�.");
		
		System.out.println(">> �ڱ� �Ұ� �Դϴ�. <<");
		System.out.println(">> �а�: ���ڼ���Ʈ���� <<");
		System.out.println(">> �й�: 201610339 <<");
		System.out.println(">> �̸�: �ڽ��� <<");
		System.out.println(">> ���: �뷡��� <<");
		System.out.println(">> �ϰ������: java ó����µ� ������ ��ڽ��ϴ� �����մϴ� <<");
	}
}
