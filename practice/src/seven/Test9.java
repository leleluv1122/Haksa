package seven;

import java.util.Arrays;

public class Test9 {
	public static void main(String[] args) {
		Integer[] a = new Integer[] { 10, 3, 5, 2, 8 };
		Arrays.sort(a);
		int idx = Arrays.binarySearch(a, 4);
		System.out.println(idx);
	}
}