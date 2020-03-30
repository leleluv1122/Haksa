// 자바에서의 기본형 (8가지, 각각의 타입에 맞는 값을 저장함)
// boolean(1byte): true/false
// char(2byte): 문자 1개 (Java는 2b C는 1b)
// byte(1byte): 정수(256개, -128 ~ 127)
// short(2byte): 정수
// int(4byte): 정수 (기본 타입)
// long(8byte): 정수
// float(4byte): 실수
// double(8byte): 실수 (기본 타입)

// 자바에서의 참조형 (클래스명, 주소를 저장할 수 있는 타입)
// Test1, String, System 등 ...

// 연산자
// 산술연산자(+,-,*,/,%)
// 비교연산자(<,>,<=,>=,==,!=)
// 논리연산자(&&(AND:모두 참일 때 참), ||(OR:하나라도 참일때 참), !(NOT: true<->false))
// 복합대입연산자(+=,-=,*=,/=...)
// a += 3; 는 a = a + 3; 와 같음

// 대입연산자 (=): 우선순위가 가장 낮음, <- 오른쪽에서 왼쪽으로 향함

// ++, --: 1증가, 1감소
// a++ (후증가), ++a(선증가), a--(후감소), --a(선감소)

public class Test1 { // Test1 클래스 정의 (클래스명은 대문자 시작)
	public static void main(String[] args) { // 메인메소드 (프로그램 시작, 단1개) 정의	
		char ch = 'a'; // 변수 선언 및 초기화
		int n = 123;
		int n2 = 100;
		int a = 10;
		
		// 후증가는 모든 문장을 실행하고 마지막에 1 증가시킴 (세미콜론; 끝나기 직전에 1증가시킴)
		System.out.println("a = " + (a++)); // a = a + 1; 와 같음
		System.out.println("a = " + a);
		
		n += n2; // n = n + n2; 와 같음
		
		System.out.println("ch = " + ch); // 화면 출력
		System.out.println("n = " + n); // 화면 출력
	}
}