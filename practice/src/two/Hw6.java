package two;

public class Hw6 {

	public static void main(String[] args) {
		String[] a = { " the", "world\t ", " \nwar " };

		for (String s : a) {
			String d = s.trim();
			System.out.printf("%s %d\n", d, d.length());
		}
	}

}
