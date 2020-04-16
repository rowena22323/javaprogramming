package kcci.interface_a;

interface IShape{
	void draw(int x, int y);
}
class Circle implements IShape{
	public void draw(int a, int b) { //�߻�Ŭ���� draw����
		System.out.println("Draw a circle:"+a+","+b);
	}
}
class Rectangle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a rectangle:"+a+","+b);
	}
}
class DrawManager{ //Draw���� Ŭ����
	IShape s; //
	public DrawManager(IShape s) { //�Ŵ��� �޼ҵ�� �������̽� �Ծ��� �����ϱ� 
	// IShape s = new Circle
		this.s = s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}
public class Test4 {
	public static void main(String[]args) {
		DrawManager d = new DrawManager(new Circle()); //�������̽� �Ծ��� �����ϱ� ��ü�� ��������� ��
		d.draw(1, 2);
		DrawManager d2 = new DrawManager(new Rectangle()); 
		d2.draw(2, 4);
	}
}
