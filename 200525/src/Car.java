public class Car {
	String color; // 3개의 멤버변수(인스턴스변수: 객체생성해야 접근가능)
	int door;
	int window = 0; // 1. 명시적 초기화 방법

	// 3. 초기화 블럭을 이용한 초기화 방법
	static { // 클래스 초기화 블럭 ( 클래스가 처음 로딩되면서 단 한번 호출됨)
		System.out.println("클래스 초기화 블럭 단 1번 호출됩니다.");
	}

	{ // 인스턴스 초기화 블럭 ( 객체 생성될 때 마다 호출됨, 생성자보다 먼저 실행)
		System.out.println("객체 생성시 생성자보다 먼저 호출되었습니다.");
	}

	// 2. 생성자 초기화 방법
	Car() { // 기본생성자 ( 초기화 담당)
		this("black", 4, 4);
		// 윗줄은 Car(String color, int door, int window) {} 부분으로
		//  갔다가 오는데, 반드시 this() 형식으로 작성해야 함...
		System.out.println("Car () 생성자 입니다.");
	}
	
	Car(int door) {
		this.door = door; // 매개변수와 멤버변수가 같을 경우는 this.을 사용함
		System.out.println("Car (int door) 생성자 입니다.");
	}

	Car(String color, int door, int window) {
		this.color = color;
		this.door = door;
		this.window = window;
		System.out.println("Car (String color, int door, int window) 생성자 입니다.");
	}
	// this. 은 객체의 주소
	// this() 같은 클래스의 다른 생성자를 호출

	void start() { // 2개의 멤버메소드(인스턴스메소드: 객체생성해야 접근가능)
		System.out.println("출발~");
	}

	void stop() {
		System.out.println("멈춤~");
	}
}
