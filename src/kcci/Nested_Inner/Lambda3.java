package kcci.Nested_Inner;
interface Printable{//�߻�޼ҵ尡 �ϳ��� �������̽�
	void print (String s);
}

//�������̽����� �޼ҵ� �ϳ� ���ǵ����� �װ͸�  ������. 
public class Lambda3 {
	public static void main(String[]args) {
		Printable prn = (s) -> {System.out.println(s);};
		prn.print("wtf");
	}

}
