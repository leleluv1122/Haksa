import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int result = random.nextInt(100) + 1; // 0~100 �� �ƴ� 1~100 �̹Ƿ� 0~99 ���� ���ϰ� 1�� ���Ѵ�.
		int chance = 4;
		boolean b = false;

		while (chance >= 0) {
			System.out.println("== " + (5 - chance) + "ȸ ���� ==");
			System.out.print("���� �Է�: ");

			int n = sc.nextInt();

			if (n > 100 || n < 0) {
				System.out.println("1~100�� �Է� �����մϴ�.");
			}

			else if (n > result) {
				chance--;
				System.out.println(n + "���� ���� ���� �Է��ϼ���.");
			}

			else if (n < result) {
				chance--;
				System.out.println(n + "���� ū ���� �Է��ϼ���.");
			}

			else {
				System.out.println("�����Դϴ�.");
				b = true;
				break;
			}

			System.out.println();
		}

		if (!b) {
			System.out.println("== 5ȸ ��� ��ȸ�� �� ����ϼ̽��ϴ� ==");
			System.out.println("������ " + result + "�Դϴ�.");
		}
	}
}