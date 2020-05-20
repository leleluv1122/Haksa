package thirteen;

import java.util.HashMap;
import java.util.Map;

// Map : key value
// Map<keyŸ��, valueŸ��> interface
// ex) Map<String, Person> m = new HashMap<String, Person>();
//	   map.put("��", new Person("ȫ�浿"));
//     Person p1 = m.get("��"); -> key:�� �� ����ߴ� value�� ȫ�浿�̶� Person ����
//	   map.remove("��"); -> key:�� �� ��ϵ� �� ����
//	   p1 = m.get("��"); -> null ����..

// HashMap�� ������ ���: O(1)  �־�: O(n)
// TreeMap�� ������ ���: O(logn) �־�: O(logn) -> key������� return..

public class Example1 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("a", 101);
		m.put("b", 102);
		m.put("c", 103);

		System.out.printf("%d %d %d\n", m.get("a"), m.get("b"), m.get("c"));
	}
}
