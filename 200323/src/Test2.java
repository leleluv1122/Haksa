// ������
// ��� ������(+, -, *, /(��), %(������) )
// �� ������(>, <, >=, <=, ==(������ ��), !=(���������� ��) -> ����� �׻� true/false
// �� ������(&&(AND), ||(OR), !(NOT))
// &&(AND) : ���� �ǿ����� ��ΰ� ���̸� ��!
// ||(OR) : ���� �ǿ����� �߿� �ϳ��� ���̸� ��!
// !(NOT) : ����, true <-> false 

public class Test2 { // Test2 Ŭ���� ����
	public static void main(String[] args) {
		int n1 = 10, n2 = 20, n3=30;
		double b1 = 1.2, b2 = 2.3;

		System.out.println("n1 + n2 = " + (n1+n2));
		System.out.println("n1 - n2 = " + (n1-n2));
		System.out.println("n1 * n2 = " + (n1*n2));
		System.out.println("n1 / n2 = " + (n1/n2)); // ����/���� = ���� 
								// �Ǽ�/���� =�Ǽ�, ����/�Ǽ�=�Ǽ�, �Ǽ�/�Ǽ�=�Ǽ� (double)
		System.out.println((n1/20.0));
		
		System.out.println("5 % 2 = " + (5%2));
						// n % 5 �� ����� 0~4�����̰�,
						// n % 5 == 0 �϶�, n�� ���� 5�� ����̴�. (==�� ���� ��� ����)
		
		System.out.println("b1 != b2 �� ����� " + (b1 != b2) + "�Դϴ�.");
		System.out.println("���̰� 10~20�� ���̸� ����ᰡ õ��!");
		System.out.println(n3 + "���� ����ᰡ õ���ΰ���? " + (n3>=10 && n3<=20));
		
		System.out.println("���̰� 10~20���� �ƴϸ� ������ ��õ��!");
		System.out.println(n3 + "���� ����ᰡ 2õ���ΰ���? " + !(n3>=10 && n3<=20));		
	}

}
