class insAnimal{
	//nothing;
}
class insPet extends insAnimal{
	//nothing;
}
class insDog extends insPet{
	//nothing;
}
public class CheckInstance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insDog odog = new insDog();
		if(odog instanceof insAnimal)
			System.out.println("odog은 insAnimal의 오브젝트이다.");
		
		if(odog instanceof insPet)
			System.out.println("odog은 insPet의 오브젝트이다.");
		
		if(odog instanceof insDog)
			System.out.println("odog은 insDog의 오브젝트이다.");
	}

}
