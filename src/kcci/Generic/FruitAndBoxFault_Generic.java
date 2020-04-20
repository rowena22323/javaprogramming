package Generic_a;

class Apple{ //class Apple extends Object {}
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an Orange";
	}
}

class Box1<T>{  //T == class Object
	private T ob; // ������ �ϴ� ������Ʈ�� �޾Ҿ�. ����Ÿ���̵� �ٹ�������
	public void set(T o) { // �� �̰ű��� ����! (aBox.set)
	// ������ƮŬ�����ϱ� �����̶� �������� ������ �� �޾Ҿ�.
		ob = o;
	}
	public T get() { //get�� ��ȯ�޼ҵ��ΰ� �ΰ� �� get ���ַ��� T!
	// public Object getBox(){return this.a = a;}
		return ob;
	}
}
public class FruitAndBoxFault_Generic {

	public static void main(String[]args) {
		Box1<Apple> aBox = new Box1<Apple>();
		Box1<Orange> oBox = new Box1<Orange>();
		
		//aBox.set("Apple");
		aBox.set(new Apple()); //����! aBox�� �����̶��
		//oBox.set("Orange");
		oBox.set(new Orange()); //����! oBox�� ������!
		
		Apple ap = aBox.get(); // get�޼ҵ��� ��ȯ���� Apple�� Orange�� ������.
		Orange og = oBox.get();
		
		System.out.println(ap); //toString�� ���⼭ ȣ��Ȱ�.
		System.out.println(og);
	}

}
