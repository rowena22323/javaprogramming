package kcci.Object_class_b;

public class BoxingUnboxing {

	public static void main(String[]args) {
		//�ڽ�
		Integer iObj = new Integer(10);
		Double dObj = new Double(3.14);
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		//��ڽ�
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		//���� �ν��Ͻ� ���� ���� ���
		iObj = new Integer(iObj.intValue()+10);
		dObj = new Double(dObj.doubleValue()+1.2);
		System.out.println(iObj);
		System.out.println(dObj);
	}
}
