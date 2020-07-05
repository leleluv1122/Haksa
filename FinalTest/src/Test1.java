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
	// 이 부분에 super(임의의 숫자); 를 추가하면 된다.
	// 상속받은 Product의 생성자에 인수한개를 받기때문에 
	// 아무것도 없으면 오류가 발생한다.
	// 또한 main에서도 생성할 때 따로 입력받는 숫자가 없기 때문에
	// 이곳에서 초기화를 해준다.
	public String toString() {
		return "Tv";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}