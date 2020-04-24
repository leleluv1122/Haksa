package two;

public class Hw9 {
	public static boolean isNullEmptyBlank(String s) {
		if(s == null)
			return true;
		else {
			String a = s.trim();
			if(a.length() == 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . " };

		for (String s : a)
			System.out.println(isNullEmptyBlank(s));
	}
}
