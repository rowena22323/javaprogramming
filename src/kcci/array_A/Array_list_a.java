package Array_list;

import java.util.ArrayList;

public class Array_list_a {
	public static void main(String[]args) {
		int[] arr = {1,2,3,4};
		
		for(int inx=0;inx < arr.length;inx++) {
			System.out.println(arr[inx]);
		}
		ArrayList al = new ArrayList(); 
		//��� ����Ʈ ������ ����
		al.add(1); //arr�ڿ� �߰����Ƴ�!
		al.add("test");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1)); //index�� ������ �� ���� �ִ�.(������)
		
		for (Object o : al) {
			System.out.println(o.toString());
		}
	}
}
