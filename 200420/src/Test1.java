public class Test1 {
	public static void main(String[] args) {
		int i, n = 10; // ���� n ���� �� �ʱ�ȭ
		int[] arr = new int[5]; // �迭 ���� arr ���� �� �ʱ�ȭ (4byte * 5�� ���ӵ� ����)
		// ���� 1���� �Ʒ� 2���� �ڵ�� ����
		// int[] arr;
		// arr = new int[5];

		for (i = 0; i < arr.length; i++) {
			arr[i] = n++;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		// �Ʒ� 2���� �迭�� ������ ���� �ʱ�ȭ �� ��� (2���� ��� ����)
		int[] arr2 = { 1, 2, 3, 4, 5 };
		// ���� 1�ٷ� ������ ���� ok������ �Ʒ� 2�ٷ� ����� new������ ������ error!
		// int[] arr2;
		// arr2 = {1,2,3,4,5};

		int[] arr3 = new int[] { 1, 2, 3 };
		// ���� 1���� �Ʒ� 2���� �ڵ�� ����
		// int[] arr3;
		// arr3 = new int[] {1,2,3};

		// �迭�� index(÷��)�� 0���� ����~

		// �迭���� for�� ����� ���� �迭�� index ���� ����� ��찡 ���Ƽ�
		// �ʱⰪ�� 0���� �ϴ� ��찡 ����!
		// �迭�� .length �� �迭�� ����� �˷���~

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