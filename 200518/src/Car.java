// import java.lang.*; // java.lang 패키지 내의 모든 클래스를 import함
// 위의 한 줄은 생략 가능 (생략시 컴파일러가 자동으로 위의 1줄을 추가해줌)

// Object 클래스는 자바의 최고 조상 클래스
// 클래스 정의시 extends를 사용하지 않으면 자동으로 extends Object 를 추가
public class Car extends Object { // Car 클래스 정의
	// 멤버변수는 초기화해주지 않으면 기본값으로 설정
	// (정수는 0,  실수는 0.0, 참조형은 null, boolean은 false)
	// 3개의 멤버변수
	int door; // static이 없으면 인스턴스 변수 (객체 생성하여 접근 가능함)
	int window;
	String color;

	// 생성자: 클래스명과 같음 (멤버의 초기화 담당)
	// 기본 생성자: 매개변수가 없음
	// 매개변수있는 생성자: 매개변수가 있음
	// 생성자는 클래스내에 1개이상 있어야 함! 
	// (단, 생성자가 1개라도 없을 경우에는 컴파일러가 자동으로 Car() { } 를 추가해 줌
	Car() { // 기본 생성자
		door = 4;
		window = 5;
		color = "black";
	}
	
	Car(int door){ // 매개변수 있는 생성자
		this(3,5,"yellow"); // this()는 같은 클래스의 다른 생성자를 호출함!
		// this()는 반드시 문장 첫번째 줄에 나와야 함!
	}
	
	Car(int door, int window, String color){
		this.door = door;
		this.window = window;
		this.color = color;
	}

	// 2개의 멤버메소드
	void start() { // static이 없으면 인스턴스 메소드 (객체 생성하여 접근 가능함)
		System.out.println("출발~~");
	}

	void stop() {
		System.out.println("멈춤~~");
	}
}
