package kcci.frameWork_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 { /* ArrayListCollection */

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("�ϳ�");
		al.add("��!");
		al.add("������!");
		for (String s : al) {
			System.out.println(s);
		}
		for (Iterator<String> itr = al.iterator();itr.hasNext();) {
			//for������ ������ ��ġ�Ҷ����� �̾Ƴ��� �� ���� ����.
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("�ϾƾƾƳ��ƾƾ�");
		al2.add("�θ��θ��ѵѸ�");
		

	}

}
