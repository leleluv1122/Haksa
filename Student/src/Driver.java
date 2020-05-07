import java.util.Scanner;

class ClassRoll {
	String className; // �������
	Student[] s; // �л��迭
	int cnt; //�����л�����
	int maxCount; //max�л�����

	public ClassRoll(String className) {
		this.className = className;
		maxCount = 10;
		cnt = 0;
		s = new Student[maxCount]; // �л��迭 max�л����ڸ�ŭ ����
		for(int i=0;i<s.length;i++) {
			s[i] = new Student(); // �ʱ�ȭ
		}
	}

	public void add(String name, int num, int n) {
		if (cnt < maxCount) { //�л����� max�л��� ���� �������
			s[n] = new Student(name, num); //�л��迭�� name�� �й��ֱ�
			cnt += 1; //�л��� +1
		}
		else { // ũ�� �⼮�� ũ���ʰ���
			System.out.println("�⼮���� ũ�� �������� �߰��� �� �����ϴ�");
		}
	}
	public String find(int num) {
		String sd = "";
		for(int i=0;i<s.length;i++) { //�⼮�ο� �ִ� �л� ��ü�� for������ ���ڴ�
			if(s[i].num == num) // ���� ã�� �й��� s[i]��° �л��� �й��̶��
				sd = s[i].name; //�� �й��� �̸��� sd�� �ְ�
		}
		return sd; // �����Ѵ�.
	}
}

class Student {
	String name;
	int num;

	Student(){}
	
	Student(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}
}

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��������� �Է��ϼ���: ");
		String subject = sc.nextLine();
		ClassRoll c = new ClassRoll(subject); //��������� ��ü����
		int n = 0; // ���ϴ� ����ޱ����� ��ü
		int a = 0; // �л���
		while (n != 3) {
			System.out.print("���ϴ� ������ �����ϼ���: (1) �߰� (2) ã�� (3) ����");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.print("�߰��ϴ� �л��� �й��� �Է��ϼ���:");
				int snum = sc.nextInt();
				sc.nextLine();
				System.out.print("�߰��ϴ� �л��� �̸��� �Է��ϼ���:");
				String name = sc.nextLine();
				// �л� �̸��� �й� �Է¹ޱ�
				
				c.add(name, snum, a); 
				a++;
				break;
			}
			case 2: {
				System.out.print("ã�� �л��� �й��� �Է��ϼ���:");
				int findnum = sc.nextInt();
				sc.nextLine();
				String realname = c.find(findnum);
				// ������ return ���� �̸�
				
				if(realname == "") { // return �����̸��� null�̶��
					System.out.println("�־��� �л��� �⼮�ο� �����ϴ�");
				} else { // return ���� �̸��� �ִٸ�
					System.out.println(findnum + "�� �̸�: " + realname);
				}
				break;
			}
			}
		}
	}

}
