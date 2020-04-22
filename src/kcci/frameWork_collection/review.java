package kcci.frameWork_collection;

import java.util.*;

public class review {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //ArrayList������ ���׸��� �������༭
		ArrayList<String> al1 = new ArrayList<>(); //Ÿ�ԸŰ������� String�� �� �� �־���
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D"); //����� ������ ���� ��밡��
		
		/* ��¹�� 1 */
		for (int inx=0; inx<al1.size();inx++) {
			System.out.println(al1.get(inx));
		}
		/* ��¹�� 2 */
		for (String s : al1) {
			System.out.println(s); //�÷��� ������ ������ enhanced-for�� �̿��� ���
		}
		/* ��¹�� 3 */
		Iterator<String> lts = al1.iterator();
		//Iterator<E>
		while(lts.hasNext()) {
			System.out.println(lts.next());
		}
		
		//Linked List ; ����ѵ� �ڷ����� ������ �ٸ�
		
		HashSet hs = new HashSet(); //�ߺ����� �ʴ� �����ͱ���
		hs.add("B");
		hs.add("B"); //�ߺ����� ���� �� ����
		hs.add("Z");
		System.out.println(hs);
		
		
		// Hash
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("C");
		hs2.add("A");
		hs2.add("C");
		System.out.println(hs2);
		
		Iterator<String> hslts = hs2.iterator();
		while(hslts.hasNext()) {
			System.out.println(hslts.next()); //�̰� ����� �� Ư���ѵ�?
		}
		
		// Map : Key - Value => Dictionary����
		Map map = new HashMap(); //key�� value ���� �����϶�
		
		map.put(1, "one");
		map.put(3, "three"); 
		map.put(2, "two");
		
		//�׳� �ΰ� ������ ������ ������ Ű ���� �̰� ������ ��
		Set set = map.entrySet();
		Iterator lts1 = set.iterator();
		//Iterator�� �ٽ�. ���� �������̽� 
		
		while (lts1.hasNext()) {
			//System.out.println(lts1.next().getClass());
			Object o = lts1.next(); //Map���� �ڷᱸ���� �ִ� ������� Object�� �޾Ƽ�
			Map.Entry e = (Map.Entry) o; //Map.Entry�� ����ȯ
			System.out.println(e.getKey()+","+e.getValue()); //key���� value�� ���ε��� ���.	
		}
		
		Map<Integer, String> map2 = new HashMap<>();
		// ���׸� - Ÿ�� ĳ���� ���� �ٷ� ��� ����
		map2.put(1, "test1");
		map2.put(2, "test2"); //Map�� ��Ʈ�� Ÿ�� 1��
		
		for (Map.Entry m : map2.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}
	}

}
