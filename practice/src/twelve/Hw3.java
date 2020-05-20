package twelve;

import java.util.Arrays;

public class Hw3 {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
	static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// bubble sort
	static void bubbleSort(String[] a) {
		for (int i = a.length - 1; i >= 1; --i) {
			boolean �Ϸ� = true;
			for (int j = 0; j < i; ++j) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					swap(a, j, j + 1);
					�Ϸ� = false;
				}
			}
			if (�Ϸ�)
				break;
		}
	}

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };

		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
