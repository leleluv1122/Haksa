// 5명의 점수를 입력받아 총점과 평균을 구하는 프로그램 (배열 score 사용)
// >> 결과화면 <<
// 학생1 점수 입력: 99
// 학생2 점수 입력: 80
// 학생3 점수 입력: 100
// 학생4 점수 입력: 79
// 학생5 점수 입력: 85

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int[] score = new int[5]; // 배열변수 score 선언 및 초기화(원소의 값은 기본값 0)
		int i, total = 0; // 반복제어 변수
		Scanner sc = new Scanner(System.in); // 사용자 입력을 위해 객체 생성

		// 배열 초기화 하는 부분(직접 입력)
		for (i = 0; i < score.length; i++) {
			System.out.print("학생 " + (i + 1) + "의 점수를 입력: ");
			score[i] = sc.nextInt();
			total += score[i];
		}

		System.out.println();

		// 결과 출력 부분
		// for (i = 0; i < score.length; i++) {
		// System.out.println("학생 "+ (i+1) + " 점수 : " + score[i]);
		// }

		//System.out.print(score.length + "명의 총점은: " + total);
		//System.out.println(" 이고, 평균은 " + ((double) total / score.length));
	
		System.out.printf("%d명의 총점은 %d점이고, 평균은 %.2f점 입니다."
				, score.length, total, (double)total / score.length);
	}

}
