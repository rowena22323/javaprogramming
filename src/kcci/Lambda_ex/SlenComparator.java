package kcci.Lambda_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SLenComp implements Comparator<String>{
						//comparator<T>�������̽��� ������ �ʿ��� ��Ȳ
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class SlenComparator {

	public static void main(String[] args) {
		List<String> list111 = new ArrayList<>();
		list111.add("Robot");
		list111.add("Lambda");
		list111.add("Box");
		
		Collections.sort(list111, new SLenComp());
		//collections.sort�޼ҵ带 ȣ���ϸ鼭 �ι�° ���ڷ� ������ ������ �����ִ� �ν��Ͻ��� �����ؼ� ����
		// �������. 
		
		for (String s : list111)
			System.out.println(s);

	}

}
