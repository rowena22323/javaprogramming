package kcci.interface_a;

/* �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ带 ������, �̸� ����ϴ� ���� Ŭ������ ���ؼ� �����Ǿ�� �� �޼ҵ尡 �ϳ� �̻� �ִ� ���*/
abstract class Animal22{
	public abstract void breath();
	public void eat() {System.out.println("Animal eat");}
	// eat()�� ������ �����ؾ� �� �޼ҵ� : Ŭ������ �޼ҵ���� �� ���� �Ǿ��ֳ� �ƴϳķ� �߻�Ŭ���� �Ǵ�
}

class Dog22 extends Animal22{
	public void breath() { // �߻�Ŭ������ ���ϻ��
		System.out.println("Dog breath");
	}
}
public class abstract_Test {
	public static void main(String[]args) {
		Animal22 a = new Dog22();
		a.breath();
	}
}
