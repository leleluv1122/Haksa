package two;

public class Hw5 {

	static String removeO(String s) {
		String a = s.replaceAll("o", "");
		String aa = a.replaceAll("O", "");
		return aa;
	}

	public static void main(String[] args) {
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" };
		for (String s : a) {
			String temp = removeO(s);
			System.out.println(temp);
		}
	}

}
