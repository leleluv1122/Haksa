package six.comparator;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
        Person[] a = new Person[] {
                new Person("ȫ�浿", 18),
                new Person("�Ӳ���", 22),
                new Person("����ġ", 23)
        };

        Arrays.sort(a, new PersonNameComparator());
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, new PersonAgeComparator());
        System.out.println(Arrays.toString(a));
    }
}
