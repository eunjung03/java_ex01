//서브 클래스 만들기 위해서 extends 키워드 사용
class Animal{	//슈퍼 클래스
	String name;
	int age;
	
	Animal(){
		System.out.println("슈퍼 클래스 Animal 생성자");
	}
}
class Cats extends Animal{	//서브 클래스
	int birth;
	Cats(){
		System.out.println("서브 클래스 Cats 생성자");
	}
}
public class Pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cats cat = new Cats();
		
		System.out.println("오브젝트 cat 생성");
	}

}
