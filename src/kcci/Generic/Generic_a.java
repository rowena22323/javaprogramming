package Generic_a;

class Animal<T>{ //���׸�ȭ �� Ŭ���� �Դϴ� (���ϴ� Ÿ�� �����������) = ĳ���� ���� �ʰ� �ٷ� �� �� �̾�.
	// �Ϲ�ȭ ������ ����� �����ϴ±����� �� �˾�ä�� ��.
	T b; //Ÿ�ԸŰ������� ���� ����
	void setbreed(T b) {this.b=b;}
	T getBreed() {
		return b;
	}
}
class Dog {
	@Override
	public String toString() {
		return "Dog";
	}
}
class Cat{
}

public class Generic_a {
	
	public static void main(String[]args) {
		Animal<Dog> a = new Animal<Dog>();
		a.setbreed(new Dog());
		Dog d = a.getBreed(); //�����Ų ��ü ���⼭ Ÿ�� �޾Ƽ� ����?
		// �Ϲ�ȭŸ�� T�� <Dog>��� ����
//		Animal<Cat> c = new Animal<Cat>();
		System.out.println(d);
	}

}
