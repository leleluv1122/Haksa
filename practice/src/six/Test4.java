package six;

import java.util.Arrays;
import java.util.Collections;

public class Test4 {
	public static void main(String[] args) {
		Integer[] a = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18 };

		Arrays.sort(a, Collections.reverseOrder());
		// Arrays.sort(a);
		System.out.println(Arrays.toString(a)); // ��ü�� �迭
		// a�� �ϸ� �ּҰ�?����? �����ų���
	}
}
