
public class Cast4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x = 3.4E+38f;
		double y = 1.7E+308;
		
		System.out.println("x= " +x+ ", y= "+y);
		y = (double) x;
		System.out.println("float -> double : " +x+" -> "+y);
		y = 1.7E+308;
		x = (float) y;
		System.out.println("double -> float : " +y+" -> "+x);
	}

}
