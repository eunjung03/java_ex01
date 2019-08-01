
public class Calc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] Data = {{1001, 1002, 1003, 1004},		//data[0][*]
					     {92, 77, 59, 94},				//data[1][*]
						 {76, 67, 45, 86},
						 {57, 86, 67, 97},
						 {0, 0, 0, 0},
						 {0, 0, 0, 0}					//data[5][*]
						 };
		int i = 0, j = 0;
		
		for(i=0; i<4; i++) {
			for(j=1; j<=3; j++)
				Data[4][i] += Data[j][i];
			
				Data[5][i] += Data[4][i]/3;
		}
		
		System.out.println("학번     국어    수학    영어    총점    평균");
		for(i=0; i<4; i++) {
			for(j=0; j<6; j++)
				System.out.print(Data[j][i]+"  ");
			
		System.out.println();
		}
	}
}
