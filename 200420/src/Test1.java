public class Test1 {
	public static void main(String[] args) {
		int i, n = 10; // 변수 n 선언 및 초기화
		int[] arr = new int[5]; // 배열 변수 arr 선언 및 초기화 (4byte * 5개 연속된 공간)
		// 위의 1줄은 아래 2줄의 코드와 같음
		// int[] arr;
		// arr = new int[5];

		for (i = 0; i < arr.length; i++) {
			arr[i] = n++;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		// 아래 2개의 배열은 원소의 값을 초기화 한 경우 (2개다 모두 가능)
		int[] arr2 = { 1, 2, 3, 4, 5 };
		// 위의 1줄로 선언할 경우는 ok이지만 아래 2줄로 선언시 new연산자 없으면 error!
		// int[] arr2;
		// arr2 = {1,2,3,4,5};

		int[] arr3 = new int[] { 1, 2, 3 };
		// 위의 1줄은 아래 2줄의 코드와 같음
		// int[] arr3;
		// arr3 = new int[] {1,2,3};

		// 배열의 index(첨자)는 0부터 시작~

		// 배열에서 for문 사용은 보통 배열의 index 값을 사용할 경우가 많아서
		// 초기값을 0으로 하는 경우가 많음!
		// 배열명 .length 는 배열의 사이즈를 알려줌~

		/*
		 * for (i = 0; i < arr.length; i++) { // 0,1,2,3,4 System.out.println("arr[" + i
		 * + "] = " + arr[i]); }
		 */

		/*
		 * for (i = 0; i < arr2.length; i++) { // 1,2,3,4,5 System.out.println("arr2[" +
		 * i + "] = " + arr2[i]); }
		 */

		for (i = 0; i < arr3.length; i++) { // 1,2,3
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}

	}
}