import java.util.Scanner; // Scanner Ŭ���� ����ϱ� ���� import !

// ����� Ű���� �Է� ó��
// Scanner Ŭ������ �����!
public class Test3 {
	private static Scanner sc;

	public static void main(String[] args) {

		int n;
		String name = "Park";

		sc = new Scanner(System.in);

		System.out.print("�̸��Է�: ");
		name = sc.nextLine(); // Ű����� ���ڿ��� �Է¹޾� name�� ����

		System.out.println("�̸��� " + name + "�Դϴ�.");

		System.out.print("�����Է�: ");
		n = sc.nextInt(); // Ű����� ������ �Է¹޾� n�� ������ ����

		System.out.println("n�� ���� " + n + "�Դϴ�.");

		// ����: �й�,�̸�,�Ǽ����Է¹���
		int studentid;
		String studentname = "chogiwha";
		Double silsu;

		System.out.print("�й��Է�: ");
		studentid = sc.nextInt();
		System.out.println("�й��� " + studentid + "�Դϴ�.");

		sc.nextLine();

		System.out.print("����� �̸��� �Է��ϼ���: ");
		studentname = sc.nextLine();

		System.out.println(studentname + "�� �ݰ����ϴ�.");

		System.out.print("�Ǽ��Է�: ");
		silsu = sc.nextDouble();

		System.out.println("�Է¹��� �Ǽ��� ����: " + silsu + "�Դϴ�.");
	}
}
