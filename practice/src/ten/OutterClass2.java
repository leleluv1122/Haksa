package ten;

public class OutterClass2 {
    int a;
    static class InnerClass {
        int b;
        void method2() {
            b = 5;
            this.b = 6;
            // a = 7;                               ������ ����
            // OutterClass2.this.a = 8;             ������ ����
            // instanceMethod();                    ������ ����
            // this.instanceMethod();               ������ ����
            // OutterClass2.this.instanceMethod();  ������ ����
            main(null);
        }
    }
    public void instanceMethod() {
        InnerClass obj = new InnerClass();
        a = 1;
        this.a = 2;
        obj.method2();
    }
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.method2();
        // a = 3;                               ������ ����
        // this.a = 4;                          ������ ����
    }
}