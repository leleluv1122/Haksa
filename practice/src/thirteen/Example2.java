package thirteen;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "a");
		m.put(102, "b");
		m.put(103, "c");

		System.out.printf("%s %s %s\n", m.get(101), m.get(102), m.get(103));
		m.remove(102);
		System.out.printf("%s %s %s\n", m.get(101), m.get(102), m.get(103));
	}

}
