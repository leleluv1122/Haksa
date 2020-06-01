// 자바에서는 단일 상속만 허용 (다중 상속은 안됨)
// 가장 많이 사용할 것을 조상(super class) 클래스로 사용하고
// 나머지는 포함관계 (클래스 내부에 객체 생성하여 접근) 를 사용함

public class Bus extends Car { // 조상클래스인 Car 클래스를 상속받는 Bus 클래스 정의
	int no;

	Bus(){ // 기본생성자
		this(123); // this()는 첫문장에 있어야 하고, this()가 있을 경우에는 앞에 super()를 넣어주지 않음
	}
	
	Bus(int no){ // 매개변수 있는 생성자
		super(); // 조상클래스의 생성자 호출, 즉 Car()을 호출함
		//super("blue", 3, 10); 
		this.no = no;
	}
	
	// super.은 조상클래스의 멤버에 접근시 사용
	// super()는 조상클래스의 생성자 호출
	
	void print_no() {
		System.out.println("버스번호는 " + this.no + "번 입니다.");
	}
	
	// 오버라이딩이란 상속관계에서 조상클래스의 메소드를 자식클래스에서 재정의하는 것!
	@Override
	void start() { // 오버라이딩
		System.out.println("버스가 출발~");
	}
}
