import java.util.Scanner; // Scanner 클래스 사용하기 위해 import !

// 사용자 키보드 입력 처리
// Scanner 클래스를 사용함!
public class Test3 {
	private static Scanner sc;

	public static void main(String[] args) {

		int n;
		String name = "Park";

		sc = new Scanner(System.in);

		System.out.print("이름입력: ");
		name = sc.nextLine(); // 키보드로 문자열을 입력받아 name에 대입

		System.out.println("이름은 " + name + "입니다.");

		System.out.print("정수입력: ");
		n = sc.nextInt(); // 키보드로 정수를 입력받아 n의 변수에 대입

		System.out.println("n의 값은 " + n + "입니다.");

		// 과제: 학번,이름,실수값입력받음
		int studentid;
		String studentname = "chogiwha";
		Double silsu;

		System.out.print("학번입력: ");
		studentid = sc.nextInt();
		System.out.println("학번은 " + studentid + "입니다.");

		sc.nextLine();

		System.out.print("당신의 이름을 입력하세요: ");
		studentname = sc.nextLine();

		System.out.println(studentname + "님 반갑습니다.");

		System.out.print("실수입력: ");
		silsu = sc.nextDouble();

		System.out.println("입력받은 실수의 값은: " + silsu + "입니다.");
	}
}
