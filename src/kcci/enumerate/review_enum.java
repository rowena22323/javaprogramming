package kcci.enumerate;

enum Menu{
	Pizza, Nuddle
}

enum Menu2{
	Pizza(100), Nuddle(200);
	int aa;
	private Menu2(int aa) { //�׸� �����Ҷ��� private
		this.aa = aa;
	}
}

public class review_enum {
	public static void main(String[]args) {
		Menu m = Menu.Pizza; //�ٷ� ����ϴ°� �ƴ϶� ���� �ѹ��ϰ�!
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));
		System.out.println(Menu.valueOf("Pizza").ordinal()); //ordinal() = default �� ��ȯ
		
		Menu2 m1 = Menu2.Pizza;
		System.out.println(m1);
		System.out.println(Menu2.valueOf("Pizza").aa); //�������̴ϱ� ������ 
	}
}
