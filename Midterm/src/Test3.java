import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("�л� �� �Է�: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�л�" + (i + 1) + " ����: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("����: " + sum);
		System.out.printf("���: %.2f\n", (double)sum / arr.length);
	}
}
