// Ŭ�������� ���� �빮�ڷ� ����
// ������, �޼ҵ���� ���� �ҹ��ڷ� ����
public class Test1 { // Test1 Ŭ���� ����
	public static void main(String[] args) {
		long num1 = 123; // ���� ����� ���ÿ� �ʱ�ȭ, ��(int, 4byte)->ū(long, 8byte)
						 // �ڵ�����ȯ
		
		int num2 = (int) 234L; // ū(Long, 8byte)->��(int, 4byte), �� �ս�
						 // ��������ȯ(������ ������ Ÿ���� ���ʿ��� (��ȣ) �ȿ� �־ ���)
		int num4 = (int) 12.3;
		
		System.out.println("num4 = " + num4); // 12 
		
		// �ƽ�Ű�ڵ� (ASCII)
		// 48 - '0'
		// 65 - 'A'
		// 97 - 'a'
		/*
		 * char ch1 = 65; int num3 = 'a';
		 */
		char ch1 = 75;
		int num3 = 'b';

		System.out.println("ch1 = " + ch1); // A
		System.out.println("num3 = " + num3); // 97
		
		
	}

}
