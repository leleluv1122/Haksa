package ten;

import java.util.Arrays;

public class HW2 {
	static void printSum(int... a) {
		int[] arr = new int[a.length];
		arr = a;
		int s = 0;
		for(int i=0;i<arr.length;i++) {
			if(i == 0) {
				System.out.print("[" + arr[i] + ", ");
				s += arr[i];
			}
			else if(i == arr.length-1) {
				System.out.print(arr[i] + "]");
				s += arr[i];
			}
			else {
				System.out.print(arr[i] + ", ");
				s += arr[i];
			}
		}
		System.out.println("  합계: " + s);
		
		/*
		 * int sum = 0; for (int i : a) { System.out.print(i + ", "); sum += i; }
		 * System.out.println("합계: " + sum);
		 */
	}

	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

		printSum(11, 13, 17, 20);
		printSum(a);
	}
}
