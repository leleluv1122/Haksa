package two;

public class Hw7 {

	static String[] split1(String s) {
		String[] a = s.split(",");
		int idx = 0;
		for (String i : a) {
			a[idx++] = i.replace(" ", "");
		}
		return a;
	}

	static String[] split2(String s) {
		String[] a = s.split(",");
		int idx = 0;
		for (String i : a) {
			a[idx++] = i.trim();
		}
		return a;
	}

	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five";
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t);
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	}

}
