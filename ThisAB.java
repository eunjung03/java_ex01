class ThisPerson{
	String name; 
	int age;
	
	ThisPerson(String a, int b){
		name = a;	//this.name = a;
		age = b; 	//this.age=b;
	}
}
public class ThisAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisPerson man = new ThisPerson("ABC",123);
		
		System.out.println("Name : "+man.name); 
		System.out.println("Age : "+man.age);
	}

}
