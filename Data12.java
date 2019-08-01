
public class Data12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int [][] a = {{10,20,30}, {40,50}, {60}};
		
		for(i=0; i<3; i=i+1)
			for(j=0; j<3-i; j=j+1)
				System.out.printf("a[%d][%d] = %d \n", i, j, a[i][j]);
	}

}
