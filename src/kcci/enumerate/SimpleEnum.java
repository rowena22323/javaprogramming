package kcci.enumerate;

enum Scale{
	DO, RE, MI, FA, SOL, LA, SI
}

public class SimpleEnum {

	public static void main(String[] args) {
		
		Scale sc = Scale.FA;
		System.out.println(sc);
		
		switch(sc) {
		case DO:
			System.out.println("��");
			break;
		case RE:
			System.out.println("��");
			break;
		case MI:
			System.out.println("��");
			break;
		case FA:
			System.out.println("��");
			break;
		default:
			System.out.println("�������ļֶ�õ��ֵֹ̼�");
		}

	}

}
