package two.plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		Set<Integer> arr = new HashSet<Integer>();
		for (int i = 0; i < numbers.length - 1; i++)
			for (int j = i + 1; j < numbers.length; j++)
				arr.add(numbers[i] + numbers[j]);
		List list = new ArrayList(arr);
		Collections.sort(list);

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			answer[i] = (int) list.get(i);
		return answer;
	}
}
