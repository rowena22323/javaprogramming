package Last_Review;

//�������� �ɰ��� : ��Ӱ��迡�� ������ �޼ҵ带 ȣ���ϴ��� �����ǵ� �޼ҵ带 ȣ��


class Shape{
	void draw() {System.out.println("draw shape");}
}

class Circle extends Shape{ //����Ŭ�������� ����Ŭ������ �޼ҵ� ������ : �������̵�
	void draw() {System.out.println("draw Circle");}
}

class Rectangle extends Shape{
	void draw() {System.out.println("draw Rectangle");}
}
public class Test4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Shape a = c; //�޼ҵ� ������  shape�� ȣ���ϴ��� circle ȣ��
		a.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Shape a1 = r;
		a1.draw();
		
		Shape[] s3 = new Shape[3]; //�������� ����
		s3[0] = new Shape();
		s3[1] = new Circle();
		s3[2] = new Rectangle();
		
		for(Shape s: s3) {s.draw();} //�������̵�� �޼ҵ� ����ȣ��
	}

}
