// 연산자
// 산술 연산자(+, -, *, /(몫), %(나머지) )
// 비교 연산자(>, <, >=, <=, ==(같으면 참), !=(같지않으면 참) -> 결과는 항상 true/false
// 논리 연산자(&&(AND), ||(OR), !(NOT))
// &&(AND) : 양쪽 피연산자 모두가 참이면 참!
// ||(OR) : 양쪽 피연사자 중에 하나라도 참이면 참!
// !(NOT) : 반전, true <-> false 

public class Test2 { // Test2 클래스 정의
	public static void main(String[] args) {
		int n1 = 10, n2 = 20, n3=30;
		double b1 = 1.2, b2 = 2.3;

		System.out.println("n1 + n2 = " + (n1+n2));
		System.out.println("n1 - n2 = " + (n1-n2));
		System.out.println("n1 * n2 = " + (n1*n2));
		System.out.println("n1 / n2 = " + (n1/n2)); // 정수/정수 = 정수 
								// 실수/정수 =실수, 정수/실수=실수, 실수/실수=실수 (double)
		System.out.println((n1/20.0));
		
		System.out.println("5 % 2 = " + (5%2));
						// n % 5 의 결과는 0~4까지이고,
						// n % 5 == 0 일때, n의 값은 5의 배수이다. (==는 같다 라는 뜻임)
		
		System.out.println("b1 != b2 의 결과는 " + (b1 != b2) + "입니다.");
		System.out.println("나이가 10~20세 사이면 입장료가 천원!");
		System.out.println(n3 + "세는 입장료가 천원인가요? " + (n3>=10 && n3<=20));
		
		System.out.println("나이가 10~20세가 아니면 입장료는 이천원!");
		System.out.println(n3 + "세는 입장료가 2천원인가요? " + !(n3>=10 && n3<=20));		
	}

}
