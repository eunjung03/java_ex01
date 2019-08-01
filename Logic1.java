
public class Logic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean r;
		int x = 10;
		
		r = (10<x) && (x<50);
		System.out.println("x= "+x+ ", (10<x)&&(x<50) = " +r);
		
		r = (x==10) || (x==50);
		System.out.println("x= "+x+ ", (x==10) || (x==50) = " +r);
		
		r = !(x==10);
		System.out.println("x= "+x+ ", !(x==10) = " +r);
	}

}
