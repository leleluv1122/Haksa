package eight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	static void addIntegersToList(List<Integer> list, int count) {
		for (int i = 0; i < count; ++i)
			list.add(i);
	}

	static void remove1(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			if (3 <= value && value <= 6)
				iterator.remove();
		}
	}

	static void remove2(List<Integer> list) {
		for (int i = 0; i < list.size(); ++i) {
			int value = list.get(i);
			if (3 <= value && value <= 6)
				list.remove(i);
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		addIntegersToList(list1, 10);
		remove1(list1);
		System.out.println(list1.toString());

		List<Integer> list2 = new ArrayList<Integer>();
		addIntegersToList(list2, 10);
		remove2(list2); // integer형식이라서 ..잘 안됨 (참조)
		System.out.println(list2.toString());
	}

}
