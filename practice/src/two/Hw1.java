package two;

public class Hw1 {

	public static void main(String[] args) {
		int a = 3;
		method(a);
		System.out.println(a);

		Person p = new Person();
		p.age = 3;
		method2(p);
		System.out.println(p.age);

		String s = "hello";
		method3(s);
		System.out.print(s);

	}

	static void method3(String s) {
		System.out.println(s);
	}

	static void method2(Person p) {
		System.out.println(p.age);
	}

	static void method(int a) {
		System.out.println(a);
	}

}
