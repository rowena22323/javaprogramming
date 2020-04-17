package kcci.object_class;

class MyClass{
	public MyClass() {
		System.out.println("Default Constructor");
	}
	public String toString() { //override
		return "My Class";
	}
	protected void finalize() throws Throwable{ //override
		super.finalize();
		System.out.println("End");
	}
}

public class Test3 {
	public static void main(String[]args) {
		MyClass m = new MyClass();
		System.out.println(m.toString());
		Object o = new Object();
		System.out.println(o.hashCode()); //hash code : ��ü�� ������ ��
		Object o1 = o;
		System.out.println(o1.hashCode());
		Object o2 = new Object();
		System.out.println(o2.hashCode());//�̰� �ٸ���ü
		System.out.println(o2.toString());//hash code > ��Ʈ������ ��ȯ
	}
}
