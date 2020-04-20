package kcci.Generic_b;

class Box<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {return ob.toString();}
}
class UnBoxer{
	public static <T> T OpenBox(Box<T> box) {return box.get();}

	//���� ���� ���빰�� Ȯ���ϴ� ����� ���׸� �޼ҵ�
	public static <T> void peekBox(Box<T> box) {
	/* Box<Integer>, Box<String>�� �ν��Ͻ��� ���ڷ� ���޹޵��� �ϱ� �����̹Ƿ�
	 * public static void peekbox(Box<Object> box)�� �����ص� ���������ʾ�.
	 * Box<Object>�� Box<String, Integer>�� ��Ӱ��踦 �������� �����ϱ�! 
	 * �̶� �����ϴ� ���� ���ϵ� ī��� ����.*/
	
		System.out.println(box); 
	}
}

public class WildcardUnboxer {
	
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So Simple String");
		UnBoxer.peekBox(box); //���ھ��� ���빰 Ȯ��

	}

}
