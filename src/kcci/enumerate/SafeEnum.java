package kcci.enumerate;

enum Animal{
	DOG, CAT
}
enum Person{
	MAN, WOMAN
}

class SafeEnum {

	public static void main(String[] args) {
		who(Person.MAN);
		who(Animal.DOG);
	}
	public static void who(Person man) {
		switch(man) {
		case MAN :
			System.out.println("�մ�");
			break;
		case WOMAN :
			System.out.println("����");
			break;
		}
	}
	public static void who(Animal dog) {
		switch(dog) {
		case DOG :
			System.out.println("��");
			break;
		case CAT :
			System.out.println("��");
			break;
		}
	}

}
