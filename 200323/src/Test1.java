// 클래스명은 보통 대문자로 시작
// 변수명, 메소드명은 보통 소문자로 시작
public class Test1 { // Test1 클래스 정의
	public static void main(String[] args) {
		long num1 = 123; // 변수 선언과 동시에 초기화, 작(int, 4byte)->큰(long, 8byte)
						 // 자동형변환
		
		int num2 = (int) 234L; // 큰(Long, 8byte)->작(int, 4byte), 값 손실
						 // 강제형변환(대입할 변수의 타입을 앞쪽에서 (괄호) 안에 넣어서 사용)
		int num4 = (int) 12.3;
		
		System.out.println("num4 = " + num4); // 12 
		
		// 아스키코드 (ASCII)
		// 48 - '0'
		// 65 - 'A'
		// 97 - 'a'
		/*
		 * char ch1 = 65; int num3 = 'a';
		 */
		char ch1 = 75;
		int num3 = 'b';

		System.out.println("ch1 = " + ch1); // A
		System.out.println("num3 = " + num3); // 97
		
		
	}

}
