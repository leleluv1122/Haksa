// 5���� ������ �Է¹޾� ������ ����� ���ϴ� ���α׷� (�迭 score ���)
// >> ���ȭ�� <<
// �л�1 ���� �Է�: 99
// �л�2 ���� �Է�: 80
// �л�3 ���� �Է�: 100
// �л�4 ���� �Է�: 79
// �л�5 ���� �Է�: 85

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int[] score = new int[5]; // �迭���� score ���� �� �ʱ�ȭ(������ ���� �⺻�� 0)
		int i, total = 0; // �ݺ����� ����
		Scanner sc = new Scanner(System.in); // ����� �Է��� ���� ��ü ����

		// �迭 �ʱ�ȭ �ϴ� �κ�(���� �Է�)
		for (i = 0; i < score.length; i++) {
			System.out.print("�л� " + (i + 1) + "�� ������ �Է�: ");
			score[i] = sc.nextInt();
			total += score[i];
		}

		System.out.println();

		// ��� ��� �κ�
		// for (i = 0; i < score.length; i++) {
		// System.out.println("�л� "+ (i+1) + " ���� : " + score[i]);
		// }

		//System.out.print(score.length + "���� ������: " + total);
		//System.out.println(" �̰�, ����� " + ((double) total / score.length));
	
		System.out.printf("%d���� ������ %d���̰�, ����� %.2f�� �Դϴ�."
				, score.length, total, (double)total / score.length);
	}

}
