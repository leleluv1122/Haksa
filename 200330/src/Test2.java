// 삼항연산자 (조건?참일때:거짓일때)
public class Test2 {
	public static void main(String[] args) {
		int n = 15;
		boolean b; // true / false만 저장 가능
		int n3 = 30;
		
		System.out.println("나이가 10~20세 사이면 입장료가 천원!");
		System.out.println(n3 + "세는 입장료가 천원인가요? " + (n3>=10 && n3<=20));
		
		System.out.println("나이가 10~20세가 아니면 입장료는 이천원!");
		System.out.println(n3 + "세는 입장료가 2천원인가요? " + (n3<10 || n3>20));	
		
		System.out.println("n > 10 보다 크면 참입니다.");
		b = (n>10) ? true : false;
		
		System.out.println("b = " + b);
	}
}