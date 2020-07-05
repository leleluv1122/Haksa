import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int result = random.nextInt(100) + 1; // 0~100 이 아닌 1~100 이므로 0~99 까지 구하고 1을 더한다.
		int chance = 4;
		boolean b = false;

		while (chance >= 0) {
			System.out.println("== " + (5 - chance) + "회 도전 ==");
			System.out.print("정수 입력: ");

			int n = sc.nextInt();

			if (n > 100 || n < 0) {
				System.out.println("1~100만 입력 가능합니다.");
			}

			else if (n > result) {
				chance--;
				System.out.println(n + "보다 작은 값을 입력하세요.");
			}

			else if (n < result) {
				chance--;
				System.out.println(n + "보다 큰 값을 입력하세요.");
			}

			else {
				System.out.println("정답입니다.");
				b = true;
				break;
			}

			System.out.println();
		}

		if (!b) {
			System.out.println("== 5회 모든 기회를 다 사용하셨습니다 ==");
			System.out.println("정답은 " + result + "입니다.");
		}
	}
}