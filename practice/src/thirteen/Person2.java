package thirteen;

import java.util.Objects;

public class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person(\"%s\",%d)", name, age);
	}

	@Override
	public int hashCode() { // 재정의 해야 map에서 key로 사용가능!
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Person2 == false)
			return false;
		Person2 p = (Person2) obj;
		return this.age == p.age && Objects.equals(this.name, p.name);
	}
}
