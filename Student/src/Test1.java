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

		System.out.print("교과목명을 입력하세요: ");
		String subject = sc.nextLine();

		for (int i = 0; i < s.length; i++) {
			s[i] = new Studen(subject);
		}
		int n = 0;
		int a = 0;
		while (n != 3) {
			System.out.print("원하는 연산을 선택하세요: (1) 추가 (2) 찾기 (3) 종료");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				if (a >= 10)
					System.out.println("출석부의 크기 부족으로 추가할 수 없습니다");
				else {
					System.out.print("추가하는 학생의 학번을 입력하세요:");
					int snum = sc.nextInt();
					sc.nextLine();
					System.out.print("추가하는 학생의 이름을 입력하세요:");
					String name = sc.nextLine();
					//System.out.println(name);
					s[a].num = snum;
					s[a].setName(name);
					a++;
				}
				break;

			}
			case 2: {
				System.out.print("찾는 학생의 학번을 입력하세요:");
				int findnum = sc.nextInt();
				sc.nextLine();
				int d = -1;
				for (int i = 0; i < s.length; i++) {
					if (findnum == s[i].getNum())
						d = i;
				}
				if (d != -1) {
					System.out.println(findnum + "의 이름: " + s[d].name);
				} else
					System.out.println("주어진 학생이 출석부에 없습니다");
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
 * System.out.print("교과목명을 입력하세요: "); String subject = sc.nextLine(); int n = 0;
 * int a = 0; while (n != 3) {
 * System.out.println("원하는 연산을 선택하세요: (1) 추가 (2) 찾기 (3) 종료"); n = sc.nextInt();
 * 
 * switch (n) { case 1: if (a > 9)
 * System.out.println("출석부의 크기 부족으로 추가할 수 없습니다"); else {
 * System.out.print("추가하는 학생의 학번을 입력하세요:"); int snum = sc.nextInt();
 * sc.nextLine(); System.out.print("추가하는 학생의 이름을 입력하세요:"); String name =
 * sc.nextLine(); s[a] = new Student(subject, name, snum); a++;
 * //s[a].setNum(snum); //s[a].setName(name); //s[a].setCr(subject); } break;
 * case 2: System.out.print("찾는 학생의 학번을 입력하세요:"); int findnum = sc.nextInt();
 * int d = -1; for (int i = 0; i < s.length; i++) { if (findnum ==
 * s[i].getNum()) { d = findnum; break; } } if (d != -1)
 * System.out.println(findnum + "의 이름: " + s[d].name);
 * 
 * else System.out.println("주어진 학생이 출석부에 없습니다"); break; } } } }
 */