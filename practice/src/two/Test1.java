package two;

public class Test1 {
	public static void main(String[] args) {
		GoodMorning g = new GoodMorning();
		System.out.println(g.hello());
	}
}

class GoodMorning{
	public String hello() {
		return "good morning";
	}
}
