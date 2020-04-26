package three;


public class Hw3 {
	static Object[][] orr = new Object[6][];

	static void addData(int count) {
		for (int i = 0; i < count; i++) {
			orr[i] = new Object[2];

			orr[i][0] = new Integer(i);
			orr[i][1] = String.valueOf(i);
		}
	}

	static int findIndex(int value) {
		int idx = 0;
		for (int i = 0; i < orr.length; i++) {
			if (orr[i][0].equals(value))
				idx = i;
		}
		return idx;
	}
	
	static int findIndex(String value) {
		int idx = 0;
		for (int i = 0; i < orr.length; i++) {
			if (orr[i][1].equals(value))
				idx = i;
		}
		return idx;
	}

	public static void main(String[] args) {
		addData(6);
		System.out.println(findIndex(3));
		System.out.println(findIndex("3"));
	}
}


/*
public class Hw3 {
	static Object[][] orr = new Object[6][2];

	static void addData(int count) {
		for (int i = 0; i < count; i++) {
			// orr[i] = new Object[2];

			orr[i][0] = new Integer(i);
			orr[i][1] = String.valueOf(i);
		}
	}

	static int findIndex(int value) {
		int idx = 0;
		for (int i = 0; i < orr.length; i++) {
			if (orr[i][0].equals(value))
				idx = i;
		}
		return idx;
	}
	
	static int findIndex(String value) {
		int idx = 0;
		for (int i = 0; i < orr.length; i++) {
			if (orr[i][1].equals(value))
				idx = i;
		}
		return idx;
	}

	public static void main(String[] args) {
		addData(6);
		System.out.println(findIndex(3));
		System.out.println(findIndex("3"));
	}
}
*/