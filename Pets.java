//���� Ŭ���� ����� ���ؼ� extends Ű���� ���
class Animal{	//���� Ŭ����
	String name;
	int age;
	
	Animal(){
		System.out.println("���� Ŭ���� Animal ������");
	}
}
class Cats extends Animal{	//���� Ŭ����
	int birth;
	Cats(){
		System.out.println("���� Ŭ���� Cats ������");
	}
}
public class Pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cats cat = new Cats();
		
		System.out.println("������Ʈ cat ����");
	}

}
