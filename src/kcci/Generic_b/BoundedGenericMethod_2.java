package kcci.Generic_b;
class Store <T>{
	private T t;
	public void add(T t) {this.t = t;}
	public T getValue() {return this.t;}
}
class Box6<T,S>{ //�ΰ� ���׸���!
	private T t;
	private S s;
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {return this.t;} //Ÿ�ԸŰ�����
	
	public S getSecond() {return this.s;}
}

public class BoundedGenericMethod_2 {

	public static void main(String[] args) {
		Box6<String, Integer> b = new Box6<String, Integer>();
		b.add("ȫ�浿", 1234);
		Box6<String, Store<String>> b2 = new Box6<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("�׽�Ʈ");
		b2.add("������", s);
		//�ϰ� ���ϴ´��~~~~ ��������� �� �̽� Store<String> ��iŬ����
		
	}

}
