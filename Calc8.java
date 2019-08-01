
public class Calc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Data = {{1001, 92, 75, 84, 0, 0},		// data[0][*]
						{1002, 92, 95, 90, 0, 0},		// data[1][*]
						{1003, 97, 90, 89, 0, 0},
						{1004, 96, 85, 97, 0, 0},		// data[3][*]
						} ;

		int i = 0, j = 0;

		for(i = 0; i < 4; i++){
			for(j=1; j<=3; j++)
		 		Data[i][4] += Data[i][j];

		 		Data[i][5] += Data[i][4]/3;
			}

		System.out.println("학번 국어 수학 영어 총점 평균");
		for(i = 0; i < 4; i++){ 
			for(j=0; j<6; j++)
				System.out.print(Data[i][j]+"  ");
			System.out.println();
			}

	}

}
