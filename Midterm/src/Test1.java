import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.printf("%d ������ ��: %2d\n", i, sum);
		}
	}
}
