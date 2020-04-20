package kcci.Generic;

class Apple11{ //class Apple extends Object {}
	public String toString() {
		return "I am an apple";
	}
}

class Orange11{
	public String toString() {
		return "I am an Orange";
	}
}

class Box12<T>{  //T == class Object
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
		Box12<Apple11> aBox = new Box12<Apple11>();
		Box12<Orange11> oBox = new Box12<Orange11>();
		
		//aBox.set("Apple");
		aBox.set(new Apple11()); //����! aBox�� �����̶��
		//oBox.set("Orange");
		oBox.set(new Orange11()); //����! oBox�� ������!
		
		Apple11 ap = aBox.get(); // get�޼ҵ��� ��ȯ���� Apple�� Orange�� ������.
		Orange11 og = oBox.get();
		
		System.out.println(ap); //toString�� ���⼭ ȣ��Ȱ�.
		System.out.println(og);
	}

}
