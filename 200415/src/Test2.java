
// while문 연습
// 1~n까지의 누적곱을 구하는 프로그램
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int i = 1, n, total = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력: ");
		n = sc.nextInt();

		// 1. 초기화
		// while(2. 조건식) {
		// 문장들;
		// 3. 증감식
		// }

		while (i <= n) {
			total *= i;
			
			if(i!=n)
				System.out.print(i + " * ");
			else
				System.out.print(i);
			i++; // 3. 증감식(프로그램에 따라 위치 중요)
		}
		System.out.print(" = " + total);
		//System.out.println("1~" + n + " 까지의 누적곱은 " + total + " 입니다.");
	}
}
