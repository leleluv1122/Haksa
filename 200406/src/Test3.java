import java.util.Scanner;

// ���ǹ�(switch�� Ȱ��)

public class Test3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		char ch = 'b';
		
		switch(ch) { // switch���� ã�� ���� ���ڸ� ����ǥ
			case 'a':
			case 'A': System.out.println("apple"); break;
			case 'b':
			case 'B': System.out.println("banana"); break;
			default: System.out.println("����");
		}
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
		// ã�°��� ���� or ��� or ������ �� �� ����
		// switch(ã�°�) { �����; }
		// case�� ���� ��ġ�� ã��
		// break���� ����/�ݺ����� {��}�� ��� (��, if�� ����)
		switch(n) {
		case 5: // ����  / �����϶��� '1':
			System.out.print("*");
		case 4:
			System.out.print("*");
		case 3:
			System.out.print("*");
		case 2:
			System.out.print("*");
		case 1:
			System.out.println("*"); break;
		default: // if���� else���� ���� (�̵� ���� �ƴ� ��)
			System.out.println("1~5�� ����");
		}
	}
}
