// 자바의 최고조상클래스는 Object 클래스다!!
// 
// import java.lang.*; 은 자동으로 첫 라인에 생성됨
// 위의 import 처럼 컴파일러가 Object 클래스를 상속받도록 추가해줌
// 클래스명 뒤에 상속되는 클래스가 없으면 extends Object 를 추가해 줌!

// 클래스는 변수 + 메소드 구성

// 클래스 내부에 작성된 변수와 메소드를 모두 멤버라고 칭함
// 멤버 변수는 지역변수와 다르게 초기값을 주지 않으면 기본값으로 설정됨!
public class Car extends Object { // Car 클래스 정의 // extend생략가능
	// 2개의 멤버 변수
	// 멤버 변수는 초기화 하지 않아도 기본값으로 설정됨, 0이나 0.0이고, 참조형은 null, boolean은 false
	String color;
	int door;
	
	// 2개의 멤버 메소드
	void start() {
		System.out.println("출발합니다.");
	}
	void stop() {
		System.out.println("멈춥니다.");
	}
}
