// ����ڿ��� ������ �Է¹޾� 3�� ����̰ų� �Ǵ� 5�� ������� Ȯ���ϴ� ���α׷�
import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		n = sc.nextInt();

		if (n % 3 == 0 || n % 5 == 0) { // n�� 3�� ��� �̰ų� �Ǵ� 5�� ����̸� ��
			System.out.println(n + "��(��) 3�� ����̰ų� 5�� ����Դϴ�.");
		} else {
			System.out.println(n + "��(��) 3�� ����̰ų� 5�� ����� �ƴմϴ�.");
		}
	}
}
