package aa.bb;

public class Test1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Bus b1 = new Bus();
		
		// ������: ����Ŭ���� Ÿ���� ���������� �ڽ� (�ڼ�) Ŭ������ �ν��Ͻ� (��ü) �� ���� ��
		Car c2 = new Bus(); // ������
		// Bus b2 = new Car(); ���� ����
	}
}
