import java.util.Scanner;

// 조건문(if문 활용)
// 성적 관리 프로그램
// 0~100점 사이만 입력 가능
public class Test2 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		score = sc.nextInt();
		
		if (score >= 0 && score <= 100) { // 0~100 사이면 참
			if (score >= 90) { // 90~
				System.out.println("A등급 입니다.");
			} else if (score >= 80) { // 80 ~89
				System.out.println("B등급 입니다.");
			} else if (score >= 70) { // 70 ~79
				System.out.println("C등급 입니다.");
			} else if (score >= 60) { // 60 ~69
				System.out.println("D등급 입니다.");
			} else { // 0~59
				System.out.println("F등급 입니다.");
			}
		} else { // 0~100 사이가 아니면 참
			System.out.println("0~100만 가능합니다!");
		}
		
		/*
		if(score >= 90 && score <= 100) { // 90~100사이면 참
			System.out.println("A등급 입니다.");
		} else if(score >= 80 && score <= 89) { // 80~89사이면 참
			System.out.println("B등급 입니다.");
		} else if(score >= 70 && score <= 79) { // 70~79사이면 참
			System.out.println("C등급 입니다.");
		} else if(score >= 60 && score <= 69) { // 60~69사이면 참
			System.out.println("D등급 입니다.");
		} else if(score >= 0 && score <= 59) { // 0~59사이면 참
			System.out.println("F등급 입니다.");
		} else { // 이도저도 아닐 때
			System.out.println("0~100만 가능합니다.");
		}
		*/
	}
}
