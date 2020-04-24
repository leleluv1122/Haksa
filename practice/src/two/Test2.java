package two;

public class Test2 {
	public static void main(String[] args) {
		String s = "hello world\n";
		String t = "Hello world\n";

		for (int i = 0; i < s.length(); ++i)
			System.out.print(s.charAt(i));

		System.out.println(s.compareTo(t) > 0);
		System.out.println(s.compareToIgnoreCase(t) == 0);        
        System.out.println(s.contains("hello"));
        System.out.println(s.endsWith("rld\n"));
        System.out.println(s.equals(t) == false);
        System.out.println(s.equalsIgnoreCase(t));
        System.out.println(s.isEmpty() == false);
        System.out.println(s.indexOf("o") == 4);
        System.out.println(s.lastIndexOf("o") == 7);
        System.out.println(s.length() == 12);
        System.out.println(s.startsWith("hell"));
        
        String[] a = s.split(" "); // " "를 기준으로 문자열을 쪼갠다
        System.out.println(a.length == 2); // 0 -> hello 1->world\n
        System.out.println(a[0].equals("hello"));
        System.out.println(a[1].equals("world\n"));

        System.out.println(s.substring(0, 5).equals("hello")); //0~5문자열 return
        System.out.println(t.toLowerCase().equals(s)); //소문자로

	}
}
