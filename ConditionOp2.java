
public class ConditionOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, abs_x;
		
		x = -10;
		abs_x = x < 0 ? -x : x;		// abs_x = ( x < 0) ? -x : x;
		System.out.println("abs(" + x + ") = " + abs_x);
		
		x = 10;
		abs_x = x < 0 ? -x : x;	
		System.out.println("abs(" + x + ") = " + abs_x);
		
		
	}

}
