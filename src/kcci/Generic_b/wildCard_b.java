package kcci.Generic_b;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends A {}

public class wildCard_b {
	static void testMethod(List<?> els) {
		// <?> �� ANY Ÿ���̰� ���׸�ó�� ���׸�ó�� ������ �ɷ��� 
		// <T extends A> 
		for (Object o : els) {
			System.out.println(o);
		}
	}
	
//	static void testMethod(List<A> els) {
//		for (A o : els) {
//			
//		}
//	}
	
	
	public static void main (String[]args) {
		List<A> aList = new ArrayList<A>();
		List<B> bList = new ArrayList<B>();
		
		testMethod(aList);
		testMethod(bList); // ���ϵ�ī�� ���ϱ� bList�� �޾ƿ´�.
		//testMethod(bList); //������ A��� �������ϱ� �ȵ�
		
		/* aList = bList? (List<A> / List<B> Ÿ���� �ٸ��ϱ� �ȵ�
		 * List<B> bList2 = List<A>; �ȵȴٱ�
		 */
		// �̷��͵� �����մϴپƾƾ�~~ (���� A�� �����Ѱ͵�)
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		
	}

}
