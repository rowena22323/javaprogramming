package frameWork_collection;

import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// �÷��� �ν��Ͻ� ����
		
		// �ν��Ͻ��� ���ڿ� ���� (add�� �ϳ��ۿ� �ȵ�.)
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		
		//����� ���ڿ� �ν��Ͻ� ����
		for (int i=0; i < list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();
		
		list.remove(0); //ù��° ���ڿ�(�ν��Ͻ�) �����
		
		//����� �ٽ� �̾ƺ���
		for (int i=0; i < list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();

	}

}
