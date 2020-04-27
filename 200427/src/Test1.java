// 객체지향프로그래밍 특징
// 1. 캡슐화
// 2. 상속
// 3. 다형성

// 클래스는 변수와 메소드로 이루어져있음
// 키워드 class 를 작성하고 그 뒤에 클래스명 쓴다 (클래스명은 대문자 시작)

// 기본형: 자바는 8개
// 참조형: 클래스명은 모두 참조형 (Test1, String, System 등)
//		  참조형은 주소를 저장할 수 있는 타입으로 참조변수는 사이즈가 4byte임!!

// public은 접근제어자로 모든 클래스에서 접근 가능!
public class Test1 { // extends Object { // Test1 클래스 정의
	public static void main(String[] args) { // 메인 메소드 (프로그램 시작위치) 정의
		// int n = 10; // 지역변수 선언 및 초기화
		Car c1 = new Car(); // c1 객체(인스턴스) 생성
		Car c2 = new Car();

		c1.color = "빨간색"; // = new String("빨간색");
		c1.door = 4;
		System.out.println("c1의 색상은 " + c1.color + "입니다.");
		System.out.println("c1의 문의 개수는 " + c1.door + "개 입니다.");
		c1.start();
		c1.stop();

		c2.color = "파란색";
		c2.door = 2;
		System.out.println("c2의 색상은 " + c2.color + "입니다.");
		System.out.println("c2의 문의 개수는 " + c2.door + "개 입니다.");
		c2.start();
		c2.stop();
	}
}
