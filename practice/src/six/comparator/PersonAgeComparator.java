package six.comparator;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.age - p2.age; // ���� ����(age)�� ���Ѵ�.
		if (r != 0)
			return r; // ���̰� ���� �ʴٸ�, ���� �� ����� �����Ѵ�.
		return p1.name.compareTo(p2.name); // ���̰� ���ٸ�, �̸�(name) �� ����� �����Ѵ�.
	}
}