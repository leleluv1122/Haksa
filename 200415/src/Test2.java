
// while�� ����
// 1~n������ �������� ���ϴ� ���α׷�
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int i = 1, n, total = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		n = sc.nextInt();

		// 1. �ʱ�ȭ
		// while(2. ���ǽ�) {
		// �����;
		// 3. ������
		// }

		while (i <= n) {
			total *= i;
			
			if(i!=n)
				System.out.print(i + " * ");
			else
				System.out.print(i);
			i++; // 3. ������(���α׷��� ���� ��ġ �߿�)
		}
		System.out.print(" = " + total);
		//System.out.println("1~" + n + " ������ �������� " + total + " �Դϴ�.");
	}
}
