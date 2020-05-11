import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("학생 수 입력: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("학생" + (i + 1) + " 점수: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총점: " + sum);
		System.out.printf("평균: %.2f\n", (double)sum / arr.length);
	}
}
