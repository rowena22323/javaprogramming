package Last_Review;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {//�������� �����ε� : ������� �ʱ�ȭ
		this.name=name;
		this.age=age;
	}
//	public void setName(String name) {this.name=name;}//������� �ϳ��� ���ؼ��� �ʱ�ȭ
//	public String getName() {return this.name;}       //���ʿ� ������... -_- ��û�ѳ�..
//	public void setAge(int age) {this.age=age;}
//	public int getAge() {return this.age;}

	public void gotoSchool() {
		System.out.println(name+","+age+"��. �� �б����� �ȴ�.");
	}
}

public class Test3 {
	public static void main(String[] args) {
		Student stu = new Student("������",100);
		stu.gotoSchool();
	}

}
