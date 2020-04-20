package kcci.Generic_b;

class Box2<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {return ob.toString();}
}
class UnBoxer2{
	public static <T> T OpenBox(Box2<T> box) {return box.get();}

	public static void peekBox(Box2<?> box) {
	//Box<T>�� ������� ������ Box<Integer/String>�ν��Ͻ����� ���ڷ� ���� �� �ִ�.
	//Box<T>�϶��� Box<?>�϶��� �����̰� �ִ°ɱ�? �ڵ尡 �� �� �����ϴ�.
	// �� ���ϵ�ī�����̶�� �Ѵٴµ� �������� @.@a
	// public static <T> void peekbox(Box<T> box)
		System.out.println(box); 
	}
}

public class WildCardUnboxer2 {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("So Simple String");
		UnBoxer2.peekBox(box); //���ھ��� ���빰 Ȯ��

		}

}


