// 같은 패키지인 경우 클래스 이름이 동일하면 안된다
class Student{
	int [] point = new int [3];
	String name;
	
	double ave() {
		return (100.0);
	}
}
public class ClassScore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student jang = new Student();
		System.out.println("Student 클래스의 오브젝트 jang 생성 성공");
		
		Student kim = new Student();
		System.out.println("Student 클래스의 오브젝트 kim 생성 성공");
	}

}
