package six;

import java.util.Arrays;
//import java.util.Collections;


public class Test1 {
	
	public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

        Arrays.sort(a);
        // Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
