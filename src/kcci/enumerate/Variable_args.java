package kcci.enumerate;

public class Variable_args {
	static void test1(String[] str) { // string���� �޴´�  str=(�׳� ����)
		for(int inx=0;inx<str.length;inx++) {
			System.out.print(str[inx]);
		}
		System.out.println();
	}
	
	static void test2(String...str2){ //�ٷ� Array�� ��� String[] str2 = {"1","2","3","4"}
		for(int inx=0;inx<str2.length;inx++) {
			System.out.print(str2[inx]);
		}
	}
	public static void main(String[]args) {
		//test1("1","2","3","4"); // �� ���������? �ٷ� Array�� ��������༭ ���� / array������� ��.
		
		String[] a = {"1","2","3","4"};
		test1(a);
		test2("1","2","3","4"); //���������̱⶧���� �ٷ� Array�� �ν�
		
	}
}
