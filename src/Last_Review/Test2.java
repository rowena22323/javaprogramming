package Last_Review;
// ��� �� ���� ���� function... ����ƽ

class Calc{
	public int add(int a, int b) {
		int c = a+b;
		return c; //return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}
public class Test2 {
	static int multi(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		
		//�ܺ� Ŭ���� ��üȭ : add�޼ҵ尡 static�� �ƴϹǷ�.
		Calc aa = new Calc();
		int c = aa.add(5, 6);
		System.out.println(c);
		
		//��üȭ ��Ű�� �ʰ� �ٷ� ���۷����� ���� ����
		int d = Calc.sub(90, 58);
		System.out.println(d);
		
		//���� Ŭ���� ���� ������� �޼ҵ忡 �ٷ� ����.
		int e = Test2.multi(78, 5);
		System.out.println(e);
		
	}

}
