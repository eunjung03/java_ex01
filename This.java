class ThisPerson1{
	String name;
	int age;
	
	ThisPerson1(String name, int age){//�������� �ʴ� �μ���
		this.name = name;
		this.age = age;
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated met hod stub
		ThisPerson1 man = new ThisPerson1("����",123);
		
		System.out.println("Name : "+man.name); 
		System.out.println("Age : "+man.age);
	}

}
