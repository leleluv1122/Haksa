// 한 줄 주석
/* 
여러
줄
주석 
*/

public class Test_201610339 { // Test_201610339 : 클래스 정의
	// 메인메소드 (프로그램 시작 위치, 단 1개만 존재)
	public static void main(String[] args) {
		// 기본형 (타입) 8개
		// 문자 (1개만 저장 가능) - char (1byte)
		// True/False만 저장 가능 - boolean (1byte)
		// 정수 - byte(1byte)
		// 정수 - short(2byte)
		// 정수 - int(4byte) - 정수 기본 타입
		// 정수 - long(8byte)
		// 실수 - float(4byte)
		// 실수 - double(8byte) - 실수 기본 타입
		
		int n = 10; //변수 n을 선언과 동시에 초기화
		int n2 = 100;
		int n3; // 변수 n3을 선언(초기값을 주지 않았기 때문에 현재는 쓰레기값)		
		n3 = 200; // 200을 n3에 대입
		
		double b1 = 12.3; //문중선언 (문장 중간에 변수 선언 가능)
		float b2 = 12.5f; // 12.5F; f를 붙여줘야 float
		// 큰(double)쪽에서 작은쪽(float) 가면 값손실이 날 수 있어서 error가남 형변환해야됨
		
		long n4 = 123L; // 작은쪽에서 큰쪽(int->long)일때는 error안난다
		// 접미사 L, l을 붙여서 사용 가능
		
		char ch = 'a'; // 문자 1개를 저장가능한 ch변수 선언 및 초기화
		char ch2 = '5'; // ""는 문자열이라서 ''만 가능
		// 'abc' error
		
		boolean bo = true; // boolean 타입의 변수에는 
		bo = false; // ture 또는 false 만 저장 가능!
		
		System.out.println("안녕하세유."); // 콘솔창에 문자열 출력 (마지막에 줄바꿈)
		System.out.print("안녕하세유."); // 콘솔창에 문자열 출력 (마지막에 줄바꿈X)
		System.out.println(); //줄바꿈
		System.out.println("\n줄바꿈을 했습니다.");
		
		System.out.println("n = " + n + "입니다.");
		System.out.println("b2 = " + b2 + "입니다.");
		
		System.out.println(">> 자기 소개 입니다. <<");
		System.out.println(">> 학과: 전자소프트웨어 <<");
		System.out.println(">> 학번: 201610339 <<");
		System.out.println(">> 이름: 박승희 <<");
		System.out.println(">> 취미: 노래듣기 <<");
		System.out.println(">> 하고싶은말: java 처음듣는데 열심히 듣겠습니당 감사합니다 <<");
	}
}
