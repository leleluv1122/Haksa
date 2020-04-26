package four_enum;

public class Test1 {
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
        switch (p1.getBloodType()) { //enumŸ���̶� switch�� ����
        case A: s = "A��"; break;
        case B: s = "B��"; break;
        case AB: s = "AB��"; break;
        case O: s = "O��"; break;
        }
        System.out.println(s);
    }

}
