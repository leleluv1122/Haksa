// 사용자에게 정수를 입력받아 3의 배수이거나 또는 5의 배수인지 확인하는 프로그램
import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		n = sc.nextInt();

		if (n % 3 == 0 || n % 5 == 0) { // n이 3의 배수 이거나 또는 5의 배수이면 참
			System.out.println(n + "은(는) 3의 배수이거나 5의 배수입니다.");
		} else {
			System.out.println(n + "은(는) 3의 배수이거나 5의 배수가 아닙니다.");
		}
	}
}
