import java.util.Scanner;

// 조건문(switch문 활용)

public class Test3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		char ch = 'b';
		
		switch(ch) { // switch에서 찾는 값이 문자면 따옴표
			case 'a':
			case 'A': System.out.println("apple"); break;
			case 'b':
			case 'B': System.out.println("banana"); break;
			default: System.out.println("없음");
		}
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		// 찾는값은 변수 or 상수 or 수식이 올 수 있음
		// switch(찾는값) { 문장들; }
		// case로 시작 위치를 찾음
		// break문은 조건/반복문의 {블럭}을 벗어남 (단, if문 제외)
		switch(n) {
		case 5: // 숫자  / 문자일때는 '1':
			System.out.print("*");
		case 4:
			System.out.print("*");
		case 3:
			System.out.print("*");
		case 2:
			System.out.print("*");
		case 1:
			System.out.println("*"); break;
		default: // if문의 else문과 같음 (이도 저도 아닐 때)
			System.out.println("1~5만 가능");
		}
	}
}
