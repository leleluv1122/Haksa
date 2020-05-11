public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car(); // c1 객체 생성

		c1.door = 2;
		Car.door = 4;
		
		System.out.println("c1의 door는 " + Car.door + "개 입니다.");
		
		c1.start(); // 인스턴스 메소드 호출 (객체 생성 필수)
		Car.stop(); // 클래스 메소드 호출 (객체생성 or 클래스명 으로 접근가능)
	}
}