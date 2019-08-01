
public class Calc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =1, a = 2;
		System.out.println("x = " + x + ", a = " + a + "-> ");
		x = ++a;
		System.out.println("x = ++a -> x = " + x + ", a = " + a);
	
		x =1; a = 2;
		System.out.println("x = " + x + ", a = " + a + "-> ");
		x = a++;
		System.out.println("x = a++ -> x = " + x + ", a = " + a);
		
		x =1; a = 2;
		System.out.println("x = " + x + ", a = " + a + "-> ");
		x = a--;
		System.out.println("x = a-- -> x = " + x + ", a = " + a);
		
		x =1; a = 2;
		System.out.println("x = " + x + ", a = " + a + "-> ");
		x = --a;
		System.out.println("x = --a -> x = " + x + ", a = " + a);
	}

}
