package kcci.Nested_Inner;

class School{
	private int m=10; //�������
	class Student{ //����� Ŭ������ ���� ��.
		void msg() {System.out.println(m);}
	}
}

public class Inner_Class {
	public static void main(String[]args) {
		School s = new School();
		//School.Student s2 = new School.Student(); �̷��Դ� �ȵǰ�
		School.Student s3 = s.new Student();// ����Ŭ������ ��üȭ ���Ѽ� School
		s3.msg();
		
	}

}
