package kcci.java;

class Animal{}
class Dog extends Animal{
}

public class AnimalTest2 {
	public static void main(String[]args) {
		Animal a = new Dog();
		if(a instanceof Dog) { //������ ĳ������ ���� instanceof ���� Ȯ��
			Dog d = (Dog) a; 
		}
	}
}
