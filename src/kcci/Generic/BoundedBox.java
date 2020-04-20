package Generic_ex;

class Box <T extends Number>{ 
	//�ν��Ͻ� ������ Ÿ�� ���ڷ� Number�Ǵ� �̸� ����ϴ� Ŭ������ �ü�����
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class BoundedBox {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();//Integer�� Number�� ���
		iBox.set(24);
		
		Box<Double> dBox = new Box<>(); //Double�� Number�� ���
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());

	}

}
