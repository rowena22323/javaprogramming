package kcci.interface_a;


interface Animal{
	void breath(); //�ڵ�� ������ ���� �ʰ� ���� �صΰڴ�. (������ ������ ����~)
}

class Dog implements Animal{ //����� �ƴϰ� ����
		//�԰�ȭ - breath �������� ������ ������ �ȵ�.
		public void breath() {
			System.out.println("Dog breath");
		}
		public void bark() {
			System.out.println("bark bark");
		}
}
class Cat implements Animal{
	public void breath() { //implements Animal.breath
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("meow meow");
	}
}
public class Animal_interface {
	static void test(Animal a) {
		a.breath();
	}
	public static void main(String[]args) {
		// Animal a = new Animal(); �������̽��� �߻�Ŭ������ ��üȭ ��ų �� ����. 
		Dog d = new Dog();
		Animal a = d; 
		a.breath();
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
}
