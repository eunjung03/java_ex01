
public class Data13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int [][] a = new int [3][];
		a[0] = new int [3];
		a[1] = new int [2];
		a[2] = new int [1];
		
		a[0][0] = 10; a[0][1] = 20; a[0][2] = 30;
		a[1][0] = 40; a[1][1] = 50;
		a[2][0] = 60;
		
		for(i=0; i<3; i=i+1)
			for(j=0; j<3-i; j=j+1)
				System.out.printf("a[%d][%d] = %d\n",i,j,a[i][j]);
	}

}
