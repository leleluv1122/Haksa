// 1~100 ������ ���� ��  3�� ����� ���� ���ϴ� ���α׷�
// >> ��� ȭ�� <<
// 1 ~ 100 ������ ���� �� 3�� ����� ���� xxx �Դϴ�.
//import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				total += i;
		}
		
		System.out.println("1 ~ 100 ������ ���� �� 3�� ����� ���� " + total + " �Դϴ�.");
		
		
		// 1~100 ������ ���� �� ¦���� ���� ���ϴ� ���α׷�
		// >> ��� ȭ�� <<
		// 1~100 ������ ���� �� ¦���� ���� xxx �Դϴ�.
		/*
		int i, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 2 == 0)
				total += i;
		}
		
		System.out.println("1~100 ������ ���� �� ¦���� ���� " + total + " �Դϴ�.");
		*/
	}
}
