package six;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

        Arrays.sort(a, 0, 5); //fromIndex <= ÀÎµ¦½º < toIndex
        System.out.println(Arrays.toString(a));
    }
}
