public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "�� �Դϴ�.");
	}
}
