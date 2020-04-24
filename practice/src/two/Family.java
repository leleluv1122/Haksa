package two;

public class Family {
	Person father, mother;
	Person[] children;
	
	public Family() {
		father = new Person("¾Æºü", 50);
		mother = new Person("¾ö¸¶", 49);
		children = new Person[2];
		children[0] = new Person("ÀÌ»Ûµþ", 24);
		children[1] = new Person("¾Æµé»õ³¢", 20);
	}
}
