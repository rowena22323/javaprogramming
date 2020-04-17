package kcci.object_class;

class User{
	public String id;
	public String password;
	
	@Override
	public boolean equals (Object o) { //��ӹ��� equals �޼ҵ� ������ // Object o = new User();
		User user = (User)o; //������Ʈ Ÿ��  user��ü�� ����ȯ > id�� password�� user�� �����ϱ�
		boolean checkFlag = false;
		if(this.id == user.id && this.password == user.password) {
		// id�� ���ƾ� �н����嵵 �� > �н����尡 ���ƾ� true
			checkFlag = true;
		}
		return checkFlag;
	}
}

public class method_Equals {

	public static void main(String[] args) {
		
		User u = new User(); //������ü����
		u.id = "test";
		u.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password = "1111";
		
		if(u.equals(u2)) { //������ ����2��ü ��
			System.out.println("Equal User");
		}
		
		Object o = new Object();
		Object o1 = new Object(); //Not Equal with o
		Object o2 = o; //Equal
		if(o.equals(o1)) {
			System.out.println("Equal");
		}else {
			System.out.println("No Equal");
		}

	}

}
