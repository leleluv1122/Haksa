// 1~100 사이의 숫자 중  3의 배수의 합을 구하는 프로그램
// >> 결과 화면 <<
// 1 ~ 100 사이의 숫자 중 3의 배수의 합은 xxx 입니다.
//import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				total += i;
		}
		
		System.out.println("1 ~ 100 사이의 숫자 중 3의 배수의 합은 " + total + " 입니다.");
		
		
		// 1~100 사이의 숫자 중 짝수의 합을 구하는 프로그램
		// >> 결과 화면 <<
		// 1~100 사이의 숫자 중 짝수의 합은 xxx 입니다.
		/*
		int i, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 2 == 0)
				total += i;
		}
		
		System.out.println("1~100 사이의 숫자 중 짝수의 합은 " + total + " 입니다.");
		*/
	}
}
