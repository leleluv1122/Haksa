import java.util.*; // Scanner Ŭ������ ����ϱ� ����

public class Test1 {
	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		n = sc.nextInt();

		if (n > 0) {
			System.out.println("��� �Դϴ�.");
		} else if (n < 0) {
			System.out.println("�����Դϴ�.");
		} else { // �̵����� �ƴ� ��
			System.out.println("0 �Դϴ�.");
		}

		System.out.println("�����մϴ�. ");
	}
}
