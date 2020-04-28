package five;

public class Hw2 {
	static String toString(String[] a) {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		for(int i=0;i<a.length;i++) {
			builder.append("\"" + a[i] + "\"");
			if(i!=a.length-1)
				builder.append(", ");
		}
		builder.append("}");
		return builder.toString();
	}

	public static void main(String[] args) {
		String[] a = { "one", "two", "three", "four" };
		String s = toString(a);
		System.out.println(s);
	}

}
