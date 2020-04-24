package two;

public class Test3 {
	public static void main(String[] args) {
		Person p1 = new Person("¹Ú½ÂÈñ", 24);
		Person p2 = new Person("·¯·¯", 20);
		
		System.out.println(p1);
		System.out.println(p2);
	}
	/*
	public static void main(String[] args) {
		String s = "hello";
		Object ss = "hello";
		
		System.out.println(s instanceof String);
		
		System.out.println(ss instanceof String);

		System.out.println(ss instanceof Object);
		
		System.out.println(ss instanceof ArrayList);
	}
	*/
	/*
	static Family family;

	public static void main(String[] args) {
		Person p1 = new Person("¹Ú½ÂÈñ", 24);
		Person p2 = new Person("·¯·¯", 20);
		
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p2.name + " " + p2.age);
	
		family = new Family();
	}
	*/
	
	
	
	
	/*
	public static void main(String[] args) {
        String s0 = "hello world";
        String s1 = "HELLO WORLD";
        String s2 = s0;
        String s3 = s1.toLowerCase();
        
        boolean b0 = (s0 == s2);
        boolean b1 = (s0 == s3);
        boolean b2 = s0.equals(s2);
        boolean b3 = s0.equals(s3);
        System.out.printf("%b %b %b %b\n", b0, b1, b2, b3);
        
        boolean b4 = s0.equals(s1);
        boolean b5 = s0.equalsIgnoreCase(s1);
        System.out.printf("%b %b\n", b4, b5);
	}
	*/
	
	
	
	/*
	static void swap(String a, String b) {
		String t = a;
		a = b;
		b = t;
	}
	public static void main(String[] args) {
		String s0 = "hello world";
		String s1 = s0.substring(0, 5);
		String s2 = s0.substring(6);
		String s3 = s1 + " " + s2;
		String s4 = s0.toUpperCase();
		System.out.printf("%s %s %s %s\n", s1, s2, s3, s4);
		
		swap(s1, s2); // º¯ÇÏÁö ¾Ê´Â´Ù a¿Í b°¡ ¹Ù²ð»Ó.... s1.s2°´Ã¼´Â º¯È­X
		System.out.printf("%s %s %s %s\n", s1, s2, s3, s4);
	}
	*/
}
