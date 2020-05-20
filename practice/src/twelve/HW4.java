package twelve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HW4 {
	static void swap(List<Comparable> list, int i, int j) {
		Comparable t = list.get(i);
		list.set(i, list.get(j));
		list.set(j, t);
	}

	static void bubbleSort(List<Comparable> list) {
		for (int i = list.size() - 1; i >= 1; --i) {
			boolean b = true;
			for (int j = 0; j < i; ++j) {
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					swap(list, j, j + 1);
					b = false;
				}
			}
			if (b)
				break;
		}
	}

	static void add(List<Comparable> list, Comparable[] a) {
		for (Comparable s : a)
			list.add(s);
	}

	static void print(List<Comparable> list) {
		for (Comparable obj : list)
			System.out.printf("%s ", obj.toString());
		System.out.println();
	}

	public static void main(String[] args) {
		String[] a1 = new String[] { "one", "two", "three", "four", "five", "size", "seven", "eight", "nine", "ten" };
		Integer[] a2 = new Integer[] { 8, 1, 7, 4, 3, 6, 2, 9, 5, 0 };

		List<Comparable> list1 = new ArrayList<Comparable>();
		List<Comparable> list2 = new LinkedList<Comparable>();
		List<Comparable> list3 = new ArrayList<Comparable>();
		List<Comparable> list4 = new LinkedList<Comparable>();

		add(list1, a1);
		bubbleSort(list1);
		print(list1);

		add(list2, a1);
		bubbleSort(list2);
		print(list2);

		add(list3, a2);
		bubbleSort(list3);
		print(list3);

		add(list4, a2);
		bubbleSort(list4);
		print(list4);

	}
}
