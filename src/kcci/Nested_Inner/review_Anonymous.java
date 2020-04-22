package kcci.Nested_Inner;

interface Database{void open();}

/* open�� ������ Ŭ������ �͸�Ŭ������ ����������*/

public class review_Anonymous {
	//���ٽ��� �������� - ���ڸ� �����Ͽ� �Ű������� �ʱ�ȭ 
	static void test(Database d) {d.open();}
	
	public static void main(String[]args) {
		Database db = new Database() {
			public void open() {System.out.println("Database open!");}
		}; //�̸��� ���� ���� Ŭ���� ~�ٷΰ�ü�����ϰ� �޼ҵ嵵�����ϰ� ���� ����
		db.open();
		
		//���� : �Ű����� Ÿ�԰����� �����Ϸ��� �˾Ƽ� ���۷���
		Database db2 = () -> {System.out.println("Open Sesami!");};
		db2.open();
		test(db2);
		
		//���ٽ��� �������� : ���ٽ��� �޼ҵ��� ���ڷ� ����
		test(()->{System.out.println("Don't open");});
	}

}
