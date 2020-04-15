
// 반복문 for문 연습
// 1~n 까지의 누적합을 구하는 프로그램
// >> 결과화면 <<
// 정수 입력: 5
// 1+2+3+4+5 = 15
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		int i, n, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력: ");
		n = sc.nextInt(); // 정수 1개 입력받아 n에 대입

		// for(1. 초기화; 2. 조건식; 3. 증감식) { 문장들; }
		for (i = 1; i <= n; i++) { // i->1,2,3,4,5 i가 1부터 n까지 n회 반복
			total += i;
			
			if (i != n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");
		}
		System.out.println(total);
		// System.out.println("1~" + n + "까지의 누적합은 " + total + "입니다. ");
	}
}
