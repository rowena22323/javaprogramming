package kcci.array_A;

class Box //extends Object 
 	{
	private String conts; 
	
	public Box(String cont){
		this.conts = cont;// ������
	}
	public String toString() {
		return conts; //objectŬ�������� �������̵� �Ǿ���.
		//��ü �ּ� ��ȯ ���� conts�� ������ ���� ����Ϸ���
		//������ �������̵�
	}
}
public class BoxArray {
	public static void main(String[]args) {
		Box[] ar = new Box[3]; //�迭 ����
		ar[0] = new Box("First"); //�ε���0, First
		ar[1] = new Box("Second"); //�ε���1, Second
		ar[2] = new Box("Third"); //�ε���2, Third
		
		System.out.println(ar[0]); //���.
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}

}

/* ��·�� ���� �߿��Ѱ� ��ü���� ��ü���� �𸣸� �ƹ��͵� �ȵ�. ���� �ݵ�� �� �� */

