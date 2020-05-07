import java.util.Scanner;

class ClassRoll {
	String className; // 교과목명
	Student[] s; // 학생배열
	int cnt; //현재학생숫자
	int maxCount; //max학생숫자

	public ClassRoll(String className) {
		this.className = className;
		maxCount = 10;
		cnt = 0;
		s = new Student[maxCount]; // 학생배열 max학생숫자만큼 지정
		for(int i=0;i<s.length;i++) {
			s[i] = new Student(); // 초기화
		}
	}

	public void add(String name, int num, int n) {
		if (cnt < maxCount) { //학생수가 max학생수 보다 작을경우
			s[n] = new Student(name, num); //학생배열에 name과 학번넣기
			cnt += 1; //학생수 +1
		}
		else { // 크면 출석부 크기초과함
			System.out.println("출석부의 크기 부족으로 추가할 수 없습니다");
		}
	}
	public String find(int num) {
		String sd = "";
		for(int i=0;i<s.length;i++) { //출석부에 있는 학생 전체를 for문으로 돌겠다
			if(s[i].num == num) // 내가 찾는 학번이 s[i]번째 학생의 학번이라면
				sd = s[i].name; //그 학번의 이름을 sd에 넣고
		}
		return sd; // 리턴한다.
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

		System.out.print("교과목명을 입력하세요: ");
		String subject = sc.nextLine();
		ClassRoll c = new ClassRoll(subject); //교과목명인 객체생성
		int n = 0; // 원하는 연산받기위한 객체
		int a = 0; // 학생수
		while (n != 3) {
			System.out.print("원하는 연산을 선택하세요: (1) 추가 (2) 찾기 (3) 종료");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.print("추가하는 학생의 학번을 입력하세요:");
				int snum = sc.nextInt();
				sc.nextLine();
				System.out.print("추가하는 학생의 이름을 입력하세요:");
				String name = sc.nextLine();
				// 학생 이름과 학번 입력받기
				
				c.add(name, snum, a); 
				a++;
				break;
			}
			case 2: {
				System.out.print("찾는 학생의 학번을 입력하세요:");
				int findnum = sc.nextInt();
				sc.nextLine();
				String realname = c.find(findnum);
				// 위에서 return 받은 이름
				
				if(realname == "") { // return 받은이름이 null이라면
					System.out.println("주어진 학생이 출석부에 없습니다");
				} else { // return 받은 이름이 있다면
					System.out.println(findnum + "의 이름: " + realname);
				}
				break;
			}
			}
		}
	}

}
