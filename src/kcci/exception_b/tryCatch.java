package kcci.exception_b;


/* try-catch������ �ϳ��� �����̹Ƿ� try Ȧ�� ������ �� ����. 
 * �ݵ�� catch������ �ϳ��̻� �����ؾ� �Ѵ�. try�� �̾ finally������ �� ���� �ִ�. 
 * finally - �ڵ��� ������ try������ �����ϸ� ������ ������ �ȴ�. */
public class tryCatch {
	public static void main(String[]args) {
		try {
			int a = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception
				e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End"); //try ������ ��� �ݵ�� ����
		}
	}
}
