
// �ݺ��� for�� ����
// 1~n ������ �������� ���ϴ� ���α׷�
// >> ���ȭ�� <<
// ���� �Է�: 5
// 1+2+3+4+5 = 15
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		int i, n, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		n = sc.nextInt(); // ���� 1�� �Է¹޾� n�� ����

		// for(1. �ʱ�ȭ; 2. ���ǽ�; 3. ������) { �����; }
		for (i = 1; i <= n; i++) { // i->1,2,3,4,5 i�� 1���� n���� nȸ �ݺ�
			total += i;
			
			if (i != n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
		}
		System.out.println(total);
		// System.out.println("1~" + n + "������ �������� " + total + "�Դϴ�. ");
	}
}
