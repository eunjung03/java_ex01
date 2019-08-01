
public class LogicAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a, b, r;
		
		a = false; b = false; r = a && b;
		System.out.println(" a      b     a && b");
		System.out.println(a+"  "+b+ "   " +r);
		
		a = false; b = true; r = a && b;
		System.out.println(a+"  "+b+ "    " +r);
		
		a = true; b = false; r = a && b;
		System.out.println(a+"   "+b+ "   " +r);
		
		a = true; b = true; r = a && b;
		System.out.println(a+"   "+b+ "    " +r);
	}

}
