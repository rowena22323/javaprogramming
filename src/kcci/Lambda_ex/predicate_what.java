package kcci.Lambda_ex;

import java.util.function.Predicate;

interface Checkvalue <T> {boolean test2(Integer a);}

public class predicate_what {
	//�ؿ� �ѹ��� check�޼ҵ��� �Ű������� ���� Line 24
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(10));
	}
	
	public static void main(String[]args) {
		//�������̽� ����� ���� ���ٽ�
		Checkvalue <Integer> c = (a) -> {return (a>18);};
		System.out.println(c.test2(18));
		
		//�������� �Ȱ����� ���� �������̽��� �ѹ�! 
		Predicate<Integer> p = (a) -> (a>18);
		System.out.println(p.test(20)); //��ȯ���� true/false
		
		// ��� �ѹ� - ���ϴ����𸣰Ե�...
		check((a) -> (a > 18), 30);
	}
}
