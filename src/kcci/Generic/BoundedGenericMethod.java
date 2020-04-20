package Generic_ex;

/* ���׸� �޼ҵ嵵 ȣ�� �� ���޵Ǵ� Ÿ�� ���ڸ� ������ �� �ִ�. 
 * ���׸� Ŭ������ Ÿ�����ڸ� ������ �� ����� Ư���� ���׸� �޼ҵ��� Ÿ�����ڸ� �����Ҷ����� �����.
 */
class Box3<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory2 {
	//<T extends Number>�� Ÿ�����ڸ� Number�� ����ϴ� Ŭ������ ������.
	public static <T extends Number> Box3<T> makeBox(T o){
		Box3<T> box = new Box3<T>();
		box.set(o);
		
		System.out.println("Boxed data: "+o.intValue());
		//Ÿ������ �������� intValueȣ�� ����
		return box;
	}
}

class UnBoxer{
	//Ÿ�����ڸ� Number�� ����ϴ� Ŭ������ ����
	public static <T extends Number> T openBox(Box3<T> box) {
		System.out.println("Unboxed data: "+box.get().intValue());
		//Ÿ������ �������� intValueȣ�� ����
		return box.get();
	}
}

public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box3<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
		int n = UnBoxer.openBox(sBox);
		System.out.println("Returned data: "+n);

	}

}
