package three;

class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Child extends Parent {
    int age;

    Child(String name, int age) {
        super(name); // �θ� Ŭ���� ������ ȣ��
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}


public class Test1 {
	public static void main(String[] args) {
		Parent p;
        Child c;
        
        p = new Parent("�θ�1");
        c = new Child("�Ƶ�1", 18);
        p = new Child("�Ƶ�2", 16);
        
        //c = new Parent(); //downcasting ����!
        //c = p;        

        System.out.println(p);
        System.out.println(c);

	}
}
