package thirteen;

import java.util.HashMap;
import java.util.Map;

// Map : key value
// Map<key타입, value타입> interface
// ex) Map<String, Person> m = new HashMap<String, Person>();
//	   map.put("가", new Person("홍길동"));
//     Person p1 = m.get("가"); -> key:가 로 등록했던 value인 홍길동이란 Person 리턴
//	   map.remove("가"); -> key:가 로 등록된 값 제거
//	   p1 = m.get("가"); -> null 리턴..

// HashMap의 성능은 평균: O(1)  최악: O(n)
// TreeMap의 성능은 평균: O(logn) 최악: O(logn) -> key순서대로 return..

public class Example1 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("a", 101);
		m.put("b", 102);
		m.put("c", 103);

		System.out.printf("%d %d %d\n", m.get("a"), m.get("b"), m.get("c"));
	}
}
