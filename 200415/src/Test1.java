import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
		if(n >= 1) {
			if(n % 2 == 0)
				System.out.println("�Է��Ͻ� " + n + "�� ¦�� �Դϴ�.");
			else
				System.out.println("�Է��Ͻ� " + n + "�� Ȧ�� �Դϴ�.");
		} else {
			System.out.println("1�̻� �Է°����մϴ�.");
		}
	}
}
