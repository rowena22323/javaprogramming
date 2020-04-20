package kcci.Generic_b;

interface IAnimal<T>{ // �Ʒ� ��õ� ���Ǵ�� �����Ͻÿ�
	void set(T t);
	T get();
	void breath();
}
class Animal<T> implements IAnimal<T> { //���� �߻�ɴϴ�~
	T animal;
	@Override
	public void set(T t) {this.animal = t;}
	@Override
	public T get() {return null;}
	@Override
	public void breath() {System.out.println("Animal breath");}
}	

class Dog{}

public class GenericInterface {
	public static void main(String[]args) {
		Animal<Dog> a = new Animal<Dog>();
		a.set(new Dog()); //��ü�� �޼ҵ� ���
		Dog al = a.get(); //���� ���������
	}
}
