package thirteen;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) throws IOException {
		String filePath = "D:/Java/0316/BaekJoon/src/Main.java";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");

		Map<String, Integer> m = new HashMap<String, Integer>();
		while (scanner.hasNext()) {
			String s = scanner.next();
			// System.out.println(s);
			int n = 0;
			if (m.containsKey(s))
				m.put(s, m.get(s) + 1);
			else
				m.put(s, 1);
		}

		for (String key : m.keySet())
			System.out.printf("(%s, %d)\n", key, m.get(key));

		scanner.close();
	}
}
