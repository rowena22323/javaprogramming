package kcci.frameWork_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> Itr = list.iterator(); //�ݺ��� ȹ��. 
		
//		while(Itr.hasNext())
//			System.out.print(Itr.next()+'\t');
//		System.out.println();
//		
//		Itr = list.iterator();
		
//		String str;
//		while(Itr.hasNext()) { //��ȯ�� ����� �ִٸ�,
//			str = Itr.next();// next�޼ҵ� ȣ���ؼ� �������� �Ѿ.
//			if(str.equals("Box")) //���� ������ ȣ���Ѱ� "Box"�� ������
//				Itr.remove(); //����
//		}
		
		int inx=1;
		List<String> al = new ArrayList<String>();
		
		while(Itr.hasNext()) { 
			String str = Itr.next();
			if(inx==2) {  // �ε��� 2���� �������ϵ��� �����غ��Ҵ�.
				Itr.remove();
			}
			else {
				al.add(str);
			System.out.println(inx);
			}
			inx++;
			
		}
		System.out.println();
		
		for(String s : al) {
			System.out.println(s);
		}
		
		
//		while(s.hasNext())
//			System.out.print(s.next()+'\t');
//		System.out.println();
	}

}

/* hasNext() next�޼ҵ� ȣ�� �� ������ ��ȯ ���� ���� Ȯ��
 * next()  
 * */
