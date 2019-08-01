
public class Data14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int [][] a = {
						{10,20,30},
						{40,50},
						{60}
					 };
		
		System.out.println("일차원 배열의 요소수 " + a.length);
		for(i=0; i<3; i++)
			System.out.println("a["+i+"]의 요소수 "+a[i].length);
	}

}
