// ���׿����� (����?���϶�:�����϶�)
public class Test2 {
	public static void main(String[] args) {
		int n = 15;
		boolean b; // true / false�� ���� ����
		int n3 = 30;
		
		System.out.println("���̰� 10~20�� ���̸� ����ᰡ õ��!");
		System.out.println(n3 + "���� ����ᰡ õ���ΰ���? " + (n3>=10 && n3<=20));
		
		System.out.println("���̰� 10~20���� �ƴϸ� ������ ��õ��!");
		System.out.println(n3 + "���� ����ᰡ 2õ���ΰ���? " + (n3<10 || n3>20));	
		
		System.out.println("n > 10 ���� ũ�� ���Դϴ�.");
		b = (n>10) ? true : false;
		
		System.out.println("b = " + b);
	}
}