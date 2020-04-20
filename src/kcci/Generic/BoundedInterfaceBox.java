package Generic_ex;

interface Eatable{
	public String eat();
}
class Apple implements Eatable{
	public String toString() {
		return "I am an apple";
	}
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}
class Box1<T extends Eatable>{
//Ÿ�����ڸ� ������ ������ �ϳ��� Ŭ������ �ϳ� �̻��� �������̽��� ���� ���ÿ� ������ �� �� �ִ�.
//Eatable�������̽��� �����ϴ� Ŭ�������� Ÿ�� ���ڷ� �� �� �ִ�. (Ÿ������ ����)
	T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		System.out.println(ob.eat());
		//Eatable�� �����Ͽ��⶧���� eatȣ�� ����
		return ob;
	}
}
public class BoundedInterfaceBox {
	public static void main(String[]args) {
		Box1<Apple> box = new Box1<>();
		box.set(new Apple()); //��� ����
		
		Apple ap = box.get(); //��� ������
		System.out.println(ap);
	}

}