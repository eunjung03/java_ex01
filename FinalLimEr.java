final class Animal_10{
	final int a = 3;
}
class Cat extends Animal_10{//����� �� ����, ������ ����
	//nothing
}
public class FinalLimEr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal_10 dog = new Animal_10();
		Cat mu = new Cat();
		
		dog.a = 5; //������ �� ����, ������ ����
	}

}
