package two;

public class Hw3 {

	static int getVowelCount(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'U' || c == 'Y')
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
		for (String s : a) {
			int count = getVowelCount(s);
			System.out.printf("%s %d\n", s, count);
		}
	}

}
