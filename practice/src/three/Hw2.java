package three;

class Person1 {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Hw2 {
	public static void main(String[] args) {
		Object[] a = new Object[3];

		a[0] = new double[] { 1.1, 2.2, 3.3 };
		a[1] = new String[] { "a", "b", "c" };
		a[2] = new Person1("¿”≤©¡§", 22);
	}
}
