package kcci.Generic_C;
/* �ʿ��� ��ŭ�� ����� ����Ͽ�, �ڵ��� ������ ������ �������� �ִ��� �߰ߵǵ��� �Ѵ�. */
/* ���� ���ϵ�ī�忡 ������ �ɾ�� �ϴ°�? : ��������*/
class Box<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
class Toy{
	@Override 
	public String toString() {return "I am a Toy";}
}
class BoxHandler{
	public static void outBox(Box<Toy> box) {
		//�Ű����� box�� �����ϴ� ���ڿ��� �ν��Ͻ��� ������ ���
		Toy t = box.get(); //���ڿ��� ������
		System.out.println(t);
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);// ���ڿ� �ֱ�
	}
}

public class BoundedWildCard_Base {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box,  new Toy());
		BoxHandler.outBox(box);
	}

}
