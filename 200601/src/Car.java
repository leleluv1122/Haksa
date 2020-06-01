// 자바의 최고 조상 클래스는 Object
// 클래스 정의시 뒤에 extends Class명이 없으면 컴파일러가 자동으로 extends Object를 추가해줌
public class Car {
	String color;
	int door;
	int window;
	
	Car(){ // 기본 생성자
		this("black", 4, 4); // 같은 클래스의 다른 생성자를 호출
	}
	
	Car(String color, int door, int window){ // 매개변수 있는 생성자
		super();
		this.color = color;
		this.door = door;
		this.window = window;
	}
	
	void start() {
		System.out.println("출발~");
	}
	void stop() {
		System.out.println("멈춤~");
	}
}
