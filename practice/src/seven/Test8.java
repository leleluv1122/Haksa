package seven;

import java.util.Arrays;
import java.util.List;

public class Test8 {
	static void printList(List<String> list) {
		for (String s : list)
			System.out.printf("%s ", s);
		System.out.println();
	}

	public static void main(String[] args) {
		String[] a = { "one", "two", "three" };
		List<String> list1 = Arrays.asList("one", "two", "three");
		List<String> list2 = Arrays.asList(a);

		printList(list1);
		printList(list2);

		System.out.println(list1.toString());
		System.out.println(list2.toString());

	}
}