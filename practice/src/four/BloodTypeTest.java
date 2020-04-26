package four;

public class BloodTypeTest {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 18, BloodType.AB);
		Person p2 = new Person("����ġ", 24, BloodType.O);
		
		System.out.println(p1);
		System.out.println(p2);

		BloodType blood1 = BloodType.valueOf("AB");
		BloodType blood2 = BloodType.valueOf("A");
		System.out.println(blood1.canGiveTo(blood2));
		System.out.println(blood2.canGiveTo(blood1));

		for (BloodType blood : BloodType.values())
			System.out.println(blood);

		String s = "";
		if (p1.getBloodType() == BloodType.A)
			s = "A��";
		else if (p1.getBloodType() == BloodType.B)
			s = "B��";
		else if (p1.getBloodType() == BloodType.AB)
			s = "AB��";
		else if (p1.getBloodType() == BloodType.O)
			s = "O��";
		System.out.println(s);
	}

}
