package twelve;

import java.util.ArrayList;
import java.util.Random;

public class HW2 {
	static void swap(ArrayList<Integer> list1, int i, int j) {
		int t = list1.get(i);
		list1.set(i, list1.get(j));
		list1.set(j, t);
	}

	static void bubbleSort(ArrayList<Integer> list1) {
		for (int i = list1.size() - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (list1.get(j) > list1.get(j + 1))
					swap(list1, j, j + 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		Random random = new Random();
		for (int i = 0; i < 200; i++) {
			list1.add(random.nextInt(100));
		}
		bubbleSort(list1);
		for (int i : list1)
			System.out.printf("%d ", i);
	}
}
