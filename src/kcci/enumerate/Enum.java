package kcci.enumerate;

public class Enum {

	enum Season{ //�׷�ȭ ���Ѽ� ����͵�
		WINTER, SPRING, SUMMER, FALL
	}
	
	enum Light{ //������� ����ġ �¿��� ������.
		ON, OFF
	}
	public static void main(String[]args) {
		for (Season s:Season.values()) {
			System.out.println(s);
		}
		Season s = Season.WINTER;
		Season s2 = Season.SPRING;
		System.out.println(s);
		System.out.println(s2);
		System.out.println(Season.valueOf("WINTER").ordinal());
		// ���Ͱ� ���� ó���� �����ϱ� ������ ��ġ��(default)0 ��ȯ
	}
}
