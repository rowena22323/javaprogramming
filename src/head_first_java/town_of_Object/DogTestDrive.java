package head_first_java.town_of_Object;

class Dog{
	int size; //?��?��?��?�� �??�� ?��?�� (size, Breed, name)
	String Breed;
	String name;
	
	void bark() { //?��?��?��?�� 메소
		System.out.println("Ruff! Ruff!");
	}
}

public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog(); //Dog 객체 ?��
		d.size = 40;
		d.bark(); //?�� ?��?��?���? bark 메소?�� ?��

	}

}
