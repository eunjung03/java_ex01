class C_Calc{
	int add(int a, int b)
	{
		return a+b ;
	}
}	
public class Class_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C_Calc calc = new C_Calc();
		System.out.println("3 + 9 = "+calc.add(3, 9));
	}

}
