package kcci.Nested_Inner;

interface Calculator{
	int add(int x, int y); // �� �޼ҵ��� ������ �ΰ�
}

/* Anonymous class */

public class OneMore_Lambda {

	public static void main(String[] args) {
		Calculator r = (a, b) -> {
			int result = a+b; 
			return result;
		};
		int r2 = r.add(1, 2);
		System.out.println(r2);

	}

}
