package kcci.Exception;

public class Test4 {
	public static void main(String[]args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c = a / b;
			int a[] = new int[5];
			a[5] = 0;
//			a[5] = 30/0;
			
		}catch(ArithmeticException e) { // ArithmeticException e = new ArithmeticException
			//���� �����޼��� �߼� �� ��� �߰� ����
			System.out.println("0���� ���������ϴ�.");
			//try{}catch{}catch{}catch{} ... ��� ���̸鼭 ���� Ȯ��
			//catch100�� �ص� �������� ������??
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) { //catch100�� �ص� �������� ���� ������ ��� ������ ��.
			System.out.println("Exception");
		}
	}
}

// Throwable(����ó�� �ֻ��� Ŭ����) > Exception > Error > ... 
// Exception���׸� å�������Ϸ��� ���� ���� ���� ����ó������ ���� ����ϵ���