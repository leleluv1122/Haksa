package two;

public class Family {
	Person father, mother;
	Person[] children;
	
	public Family() {
		father = new Person("�ƺ�", 50);
		mother = new Person("����", 49);
		children = new Person[2];
		children[0] = new Person("�̻۵�", 24);
		children[1] = new Person("�Ƶ����", 20);
	}
}
