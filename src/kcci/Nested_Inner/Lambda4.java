package kcci.Nested_Inner;

interface Printable2{
	void print(String s);
}

public class Lambda4 {
	public static void ShowString(Printable p, String s) {
		p.print(s);
	}
	public static void main(String[]args) {
		ShowString((s) -> {System.out.println(s);},"WTF");
							//���� ���� �޼ҵ��� ���ڷ� ������ �� �ִ�.
	}

}
