package kcci.java;
class A{
	void aMethod() {System.out.println("aMethod");}
}
class B extends A {
	void bMethod() {System.out.println("bMethod");}
}
public class instanceOf {
	public static void main(String [] args) {
		B b = new B();
		String className = b.getClass().getSimpleName();
		System.out.println(className);
		
		if(className.equals("B")) {
			System.out.println("B Okay");
		}
		if (b instanceof B) { // if(className.equals("B")
			System.out.println("B ok");
		} //����ϱ� ���϶��.. instanceof�� ������.
		boolean check1 = b instanceof A; //��û�߿��� ��
		System.out.println(check1);// ��û �߿��� ��
		
		B b1 = null;
		boolean check2 = b1 instanceof A;
		//�ȸ����� ������ false 
		System.out.println(check2);
	
	}
}
