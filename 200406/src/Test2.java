import java.util.Scanner;

// ���ǹ�(if�� Ȱ��)
// ���� ���� ���α׷�
// 0~100�� ���̸� �Է� ����
public class Test2 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100): ");
		score = sc.nextInt();
		
		if (score >= 0 && score <= 100) { // 0~100 ���̸� ��
			if (score >= 90) { // 90~
				System.out.println("A��� �Դϴ�.");
			} else if (score >= 80) { // 80 ~89
				System.out.println("B��� �Դϴ�.");
			} else if (score >= 70) { // 70 ~79
				System.out.println("C��� �Դϴ�.");
			} else if (score >= 60) { // 60 ~69
				System.out.println("D��� �Դϴ�.");
			} else { // 0~59
				System.out.println("F��� �Դϴ�.");
			}
		} else { // 0~100 ���̰� �ƴϸ� ��
			System.out.println("0~100�� �����մϴ�!");
		}
		
		/*
		if(score >= 90 && score <= 100) { // 90~100���̸� ��
			System.out.println("A��� �Դϴ�.");
		} else if(score >= 80 && score <= 89) { // 80~89���̸� ��
			System.out.println("B��� �Դϴ�.");
		} else if(score >= 70 && score <= 79) { // 70~79���̸� ��
			System.out.println("C��� �Դϴ�.");
		} else if(score >= 60 && score <= 69) { // 60~69���̸� ��
			System.out.println("D��� �Դϴ�.");
		} else if(score >= 0 && score <= 59) { // 0~59���̸� ��
			System.out.println("F��� �Դϴ�.");
		} else { // �̵����� �ƴ� ��
			System.out.println("0~100�� �����մϴ�.");
		}
		*/
	}
}
