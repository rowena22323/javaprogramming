package kcci.object_class;

public class equals_String {
	public static void main(String[]args) {
		String str = "test";
		String str1 = "test";
		if(str == str1) {
			System.out.println("ok");
		}
		String str2 = new String("Test");
		String str3 = new String("Test");
		
		if (str2 == str3) { //�ν��Ͻ��� �ּҺ�
			System.out.println("ok??");
		}
		if (str2.equals(str3)){ // �ν��Ͻ��� �����
			System.out.println("same");
		}
	}
}
