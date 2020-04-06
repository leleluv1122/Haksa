import java.util.*; // Scanner 클래스를 사용하기 위해

public class Test1 {
	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력: ");
		n = sc.nextInt();

		if (n > 0) {
			System.out.println("양수 입니다.");
		} else if (n < 0) {
			System.out.println("음수입니다.");
		} else { // 이도저도 아닐 때
			System.out.println("0 입니다.");
		}

		System.out.println("종료합니다. ");
	}
}
