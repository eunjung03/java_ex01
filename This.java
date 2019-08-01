class ThisPerson1{
	String name;
	int age;
	
	ThisPerson1(String name, int age){//권장하지 않는 인수명
		this.name = name;
		this.age = age;
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated met hod stub
		ThisPerson1 man = new ThisPerson1("은정",123);
		
		System.out.println("Name : "+man.name); 
		System.out.println("Age : "+man.age);
	}

}
