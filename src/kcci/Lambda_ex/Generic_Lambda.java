package kcci.Lambda_ex;

interface Calc <T> { //���׸� ����� �Լ��� �������̽�
	T operation(T a, T b);
}

public class Generic_Lambda {

	public static void main(String[] args) {
		Calc<Integer> c = (x, y) -> {return x+y;};
		
		System.out.println(c.operation(1, 2));
		

	}

}
