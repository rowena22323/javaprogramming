package kcci.Generic;

import java.util.ArrayList; //���� �˾Ƽ� �Ǵϱ� ÷���� ���ʿ� ����.


public class Array_Generic {
	public static void main(String[]args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two"); //String�� ���� array�� �ڵ� ĳ����
		
		for (String s : al) {
			System.out.println(s); //����϶�
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//�̹��� Integer�� ĳ���� �Ѵ� ��ĳ ��θ� �ڽ� ��ڽ��Ҷ��� ����
		
		//Generic ���п� �ڵ差�� Ȯ�پ��ٴµ� ��¼���.
		//.Net�� ���͵� generic
	}
}
