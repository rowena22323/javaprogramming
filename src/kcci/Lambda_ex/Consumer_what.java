package kcci.Lambda_ex;

import java.util.function.Consumer;
interface Database{void open(String dbName);}

public class Consumer_what {

	public static void main(String[] args) {
		
		//����� Data type
		Database db = (dbName) -> {
			System.out.println(dbName + " open");
		};
		db.open("jjj"); //�����������!
		
		//����Ÿ�Ծ��� �Ķ���͸� ���� �� : ������ �������̽� : �������̽� ���� ���� �� :(
		Consumer <String> o = (dbName) ->{
			System.out.println(dbName+" open");
		};
		o.accept("Database"); //consumer - accept ¦!

	}

}
