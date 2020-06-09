package aa.bb;

public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Bus b1 = new Bus();
		
		// 다형성: 조상클래스 타입의 참조변수로 자식 (자손) 클래스의 인스턴스 (객체) 를 접근 하
		Car c2 = new Bus(); // 다형성
		// Bus b2 = new Car(); 문법 오류
	}
}
