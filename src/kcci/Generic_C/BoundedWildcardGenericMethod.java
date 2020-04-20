package kcci.Generic_C;
/* ���ѵ� ���ϵ�ī�� ������ ���� ���׸� �޼ҵ� */
class Box3<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
class Toy3{
	@Override
	public String toString() {return "I am a Toy";}
}
class Robot3{
	@Override
	public String toString() {return "I am a Robot";}
}
class BoxHandler3{
	//Box<Toy>�ν��Ͻ��� Box<Robot>�ν��Ͻ��� ���ÿ� ����� �� �ֵ��� inBox�� outBox�޼ҵ带 ����
	public static <T> void outBox(Box3<?extends T> box) {
									// �޼ҵ� �����ε�
		T t = box.get();//���ڿ��� ������
		System.out.println(t);
	}
	public static <T> void inBox(Box3<? super T> box, T n) {
		box.set(n); //���ڿ� �ֱ�
	}
}

public class BoundedWildcardGenericMethod {

	public static void main(String[] args) {
		Box3<Toy3> tBox = new Box3<>();
		BoxHandler3.inBox(tBox,  new Toy3());
		BoxHandler3.outBox(tBox);
		Box3<Robot3> rBox = new Box3<>();
		BoxHandler3.inBox(rBox, new Robot3());
		BoxHandler3.outBox(rBox);

	}

}
