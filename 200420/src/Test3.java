// 2�����迭 ���� �� �ʱ�ȭ ���
public class Test3 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 4, 5, 6 }, { 7, 8 }, { 1, 2, 3 } }; // ���� (���� ������ �ٸ�) �迭
		int[][] arr2 = new int[3][2]; // 3�� 2�� 2���� �迭 ���� arr2 ���� �� �ʱ�ȭ (�⺻�� 0)

		int score[][] = new int[3][4];
		int i, j;

		// 2���� �迭�� score.length�� �� ��쿡�� ���� ������ ��
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // �ٹٲ�
		}
	}
}
