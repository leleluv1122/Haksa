import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.printf("%d 까지의 합: %2d\n", i, sum);
		}
	}
}
