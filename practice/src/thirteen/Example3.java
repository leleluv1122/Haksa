package thirteen;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(101, new Person("ȫ�浿", 18));
		map.put(102, new Person("�Ӳ���", 19));

		System.out.printf("%s  %s  %s\n", map.get(101), map.get(102), map.get(103));

		map.remove(102);
		System.out.printf("%s  %s  %s\n", map.get(101), map.get(102), map.get(103));
	}

}
