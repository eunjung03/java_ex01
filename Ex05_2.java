
public class Ex05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		
		for(int m = 0; m < a.length ; m++) {
			for(int n = 0; n < a[m].length ; n++) {
				a[m][n] = m*10 + n;
				System.out.printf("a[%d][%d] = %d\n",m,n,a[m][n]);
			}
		}
	}

}
