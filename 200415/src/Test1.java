import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		if(n >= 1) {
			if(n % 2 == 0)
				System.out.println("입력하신 " + n + "은 짝수 입니다.");
			else
				System.out.println("입력하신 " + n + "은 홀수 입니다.");
		} else {
			System.out.println("1이상만 입력가능합니다.");
		}
	}
}
