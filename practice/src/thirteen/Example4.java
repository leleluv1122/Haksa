package thirteen;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(new Person("ȫ�浿", 18), 101);
		map.put(new Person("�Ӳ���", 19), 102);

		System.out.println(map.get(new Person("ȫ�浿", 18)));
		System.out.println(map.get(new Person("�Ӳ���", 19)));
	}
}