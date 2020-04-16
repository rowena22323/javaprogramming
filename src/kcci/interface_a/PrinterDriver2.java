package kcci.interface_a;

interface Printable{
	void print(String doc); //����� ���� �߻� �޼ҵ�
	// �������̽��� ��� �޼ҵ�� public�� ����� ������ ����.
}

class Prn204Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-204 printer");
		System.out.println(doc);
	}
}
class Prn731Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}
public class PrinterDriver2 {

	public static void main(String[] args) {
		String myDoc = "This is a report aboud...";
		
		Printable prn = new Prn204Drv();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn731Drv();
		prn.print(myDoc);
	}
}


/* �������̽��� �⺻�� �� �ǹ�
 * �������̽��� ���� ������� ���������� ������ �����ϴ�.
 * �������̽��� �߻� �޼ҵ�� �̸� �����ϴ� �޼ҵ� ���̿� �������̵� ���谡 �����Ѵ�.  @Override ���� ����
 * �߻�޼ҵ� : �޼ҵ��� ��ü�� ����ִ� �޼ҵ�
 * �������̽��� ������ �� �ִ� �޼ҵ� (abstract, default, static)
 * ���� : �������̽��� ������δ� �ν��Ͻ� ������ �Ұ����ϰ� �ٸ� Ŭ������ ���� implements�� ���
 * 		- Ű���� implements�� ���
 * 		- �� Ŭ������ �� �̻��� �������̽��� ���ÿ� ������ �� �ִ�.
 * 		- ��Ӱ� ������ ���ÿ� ����*/