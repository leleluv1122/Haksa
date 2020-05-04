package ten;

public class HW3 {
	int a = 3, b = 4;
	
	class InnerClass{
		void swap() {
			int t = a;
			a = b;
			b = t;
		}
	}
	
    void doSomethoing() {
        new InnerClass().swap();
        System.out.printf("%d %d\n", a, b);
    }

    public static void main(String[] args) {
        new HW3().doSomethoing();
    }
}
