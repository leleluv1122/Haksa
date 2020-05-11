import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력: ");
			arr[i] = sc.nextInt();
		}

		int a = 0; // 최대값
		int b = 65535;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > a)
				a = arr[i];
			if(arr[i] < b)
				b = arr[i];
		}
		System.out.println();
		System.out.println("최대값: " + a);
		System.out.println("최소값: " + b);
	}
}
