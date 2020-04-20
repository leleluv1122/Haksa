// 2차원배열 선언 및 초기화 방법
public class Test3 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 4, 5, 6 }, { 7, 8 }, { 1, 2, 3 } }; // 가변 (열의 개수가 다름) 배열
		int[][] arr2 = new int[3][2]; // 3행 2열 2차원 배열 변수 arr2 선언 및 초기화 (기본값 0)

		int score[][] = new int[3][4];
		int i, j;

		// 2차원 배열의 score.length를 할 경우에는 행의 개수가 됨
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
