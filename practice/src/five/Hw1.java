package five;

public class Hw1 {
	static String reverse(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; --i) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		String s = "hello world";
		String sa = reverse(s);
		System.out.println(sa);
	}

	
	
	/*
	static StringBuilder reverse(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; --i) {
			builder.append(s.charAt(i));
		}
		return builder;
	}

	public static void main(String[] args) {
		String s = "hello world";
		StringBuilder sa = reverse(s);
		System.out.println(sa);
	}
	*/
}