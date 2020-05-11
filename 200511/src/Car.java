// 클래스 내에 선언한 변수/메소드를 멤버변수/멤버메소드라고 부름
// static이 없이 선언한 변수/메소드를 인스턴스 변수/인스턴스 메소드라고 부름
// static이 선언된 변수/메소드를 클래스(static,공유) 변수/클래스(static,공유) 메소드라고 부름

// 인스턴스변수 (인스턴스 메소드)
// 선언시 앞쪽에 static이 없는 것으로, 객체 (인스턴스) 를 생성하여 접근해야 함

// 클래스변수 (클래스 메소드)
// 선언시 앞쪽에 static이 있는 것으로, 객체 (인스턴스) 를 생성해도 되고, 안하고 클래스명으로 접근 가능

// Car 클래스 정의
public class Car {
	// 3개의 멤버 변수
	String color; // 인스턴스 변수
	static int door; // 클래스 변수(static 변수, 공유 변수)
	int window;
	
	// 2개의 멤버 메소드
	void start() { // 인스턴스 메소드
		System.out.println("출발~~");
	}
	static void stop() { // 클래스 메소드(static 메소드, 공유 메소드)
		System.out.println("멈춤~~");
	}
}
