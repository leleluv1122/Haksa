class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(150); 
	}
	// �� �κп� super(������ ����); �� �߰��ϸ� �ȴ�.
	// ��ӹ��� Product�� �����ڿ� �μ��Ѱ��� �ޱ⶧���� 
	// �ƹ��͵� ������ ������ �߻��Ѵ�.
	// ���� main������ ������ �� ���� �Է¹޴� ���ڰ� ���� ������
	// �̰����� �ʱ�ȭ�� ���ش�.
	public String toString() {
		return "Tv";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}