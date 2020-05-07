package twelve;

import java.util.LinkedList;

// 홀수만 남기기
public class HW1 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		for (int i = 0; i <= 99; i++) {
			list1.add(i);
		}

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) % 2 == 0)
				list1.remove(i);
		}
		for (int i : list1)
			System.out.printf("%d ", i);
	}
}
