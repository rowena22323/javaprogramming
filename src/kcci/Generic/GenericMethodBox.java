package Generic_ex;

class Box2<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static <T> Box2<T> makeBox(T o){  //���׸� �޼ҵ� ����
		//�޼ҵ��� �̸��� makeBox�̰�, ��ȯ���� Box<T>�̴�.
		//�׸��� T�� Ÿ�� �Ű������� ���� (Box2<T>�� ��ȯ��, <T>�� Ÿ�ԸŰ�����)
		Box2<T> box = new Box2<T>(); //���� ����
		box.set(o); //���޵� �ν��Ͻ��� ���ڿ� ��Ƽ�
		return box; //��ȯ
	}
}
public class GenericMethodBox {

	public static void main(String[] args) {
		Box2<String> sBox = BoxFactory.makeBox("Sweet"); //�޼ҵ� ȣ��ÿ� �ڷ����� ������
		    //<String>�� T�� ���� Ÿ������.
		System.out.println(sBox.get());
		Box2<Double> dBox = BoxFactory.makeBox(7.59); //7.59����ڽ�
		System.out.println(dBox.get());

	}

}
