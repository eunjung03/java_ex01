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
			System.out.println("odog�� insAnimal�� ������Ʈ�̴�.");
		
		if(odog instanceof insPet)
			System.out.println("odog�� insPet�� ������Ʈ�̴�.");
		
		if(odog instanceof insDog)
			System.out.println("odog�� insDog�� ������Ʈ�̴�.");
	}

}
