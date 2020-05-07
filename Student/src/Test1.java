import java.util.Scanner;

class Drive {
	String cr;

	Drive(String cr) {
		this.cr = cr;
	}

	@Override
	public String toString() {
		return cr;
	}
}

class Studen extends Drive {
	String name;
	int num;

	Studen(String cr) {
		super(cr);
	}

	Studen(String cr, String name, int num) {
		super(cr);
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

public class Test1 {

	public static void main(String args[]) {
		Studen[] s = new Studen[10];

		Scanner sc = new Scanner(System.in);

		System.out.print("��������� �Է��ϼ���: ");
		String subject = sc.nextLine();

		for (int i = 0; i < s.length; i++) {
			s[i] = new Studen(subject);
		}
		int n = 0;
		int a = 0;
		while (n != 3) {
			System.out.print("���ϴ� ������ �����ϼ���: (1) �߰� (2) ã�� (3) ����");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				if (a >= 10)
					System.out.println("�⼮���� ũ�� �������� �߰��� �� �����ϴ�");
				else {
					System.out.print("�߰��ϴ� �л��� �й��� �Է��ϼ���:");
					int snum = sc.nextInt();
					sc.nextLine();
					System.out.print("�߰��ϴ� �л��� �̸��� �Է��ϼ���:");
					String name = sc.nextLine();
					//System.out.println(name);
					s[a].num = snum;
					s[a].setName(name);
					a++;
				}
				break;

			}
			case 2: {
				System.out.print("ã�� �л��� �й��� �Է��ϼ���:");
				int findnum = sc.nextInt();
				sc.nextLine();
				int d = -1;
				for (int i = 0; i < s.length; i++) {
					if (findnum == s[i].getNum())
						d = i;
				}
				if (d != -1) {
					System.out.println(findnum + "�� �̸�: " + s[d].name);
				} else
					System.out.println("�־��� �л��� �⼮�ο� �����ϴ�");
				break;
			}
			}

		}
	}
}

/*
 * import java.util.Scanner;
 * 
 * class Driver { String cr;
 * 
 * Driver(String cr) { this.cr = cr; }
 * 
 * @Override public String toString() { return cr; }
 * 
 * public String getCr() { return cr; }
 * 
 * public void setName(String cr) { this.cr = cr; } }
 * 
 * class Student extends Driver { String name; int num;
 * 
 * Student(String cr, String name, int num) { super(cr); this.name = name;
 * this.num = num; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getNum() { return num; }
 * 
 * public void setNum(int num) { this.num = num; }
 * 
 * public void setCr(String cr) { this.cr = cr; } }
 * 
 * public class Test1 {
 * 
 * public static void main(String args[]) { Student[] s = new Student[10];
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("��������� �Է��ϼ���: "); String subject = sc.nextLine(); int n = 0;
 * int a = 0; while (n != 3) {
 * System.out.println("���ϴ� ������ �����ϼ���: (1) �߰� (2) ã�� (3) ����"); n = sc.nextInt();
 * 
 * switch (n) { case 1: if (a > 9)
 * System.out.println("�⼮���� ũ�� �������� �߰��� �� �����ϴ�"); else {
 * System.out.print("�߰��ϴ� �л��� �й��� �Է��ϼ���:"); int snum = sc.nextInt();
 * sc.nextLine(); System.out.print("�߰��ϴ� �л��� �̸��� �Է��ϼ���:"); String name =
 * sc.nextLine(); s[a] = new Student(subject, name, snum); a++;
 * //s[a].setNum(snum); //s[a].setName(name); //s[a].setCr(subject); } break;
 * case 2: System.out.print("ã�� �л��� �й��� �Է��ϼ���:"); int findnum = sc.nextInt();
 * int d = -1; for (int i = 0; i < s.length; i++) { if (findnum ==
 * s[i].getNum()) { d = findnum; break; } } if (d != -1)
 * System.out.println(findnum + "�� �̸�: " + s[d].name);
 * 
 * else System.out.println("�־��� �л��� �⼮�ο� �����ϴ�"); break; } } } }
 */