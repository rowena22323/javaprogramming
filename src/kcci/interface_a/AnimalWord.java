package kcci.interface_a;

interface IAnimal{
	public void breath(); 
}
abstract class Dog33 implements IAnimal{
	public abstract void breath();
}
class Dog44 extends Dog33{
	public void breath() {
		System.out.println("Dog3 breath");
	}
}
public class AnimalWord {
	public static void main(String[]args) {
		IAnimal a = new Dog44();
		a.breath(); //ȣ��ÿ��� ������ ��ü�� ����� �������̵� �� �޼ҵ� ��밡��
	}

}
