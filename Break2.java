
public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		for(i=0; i<2; i++) {
			System.out.println("첫 번째 루프 "+i);
		
			for(j=0; j<2; j++) {
				System.out.println("   두 번째 루프 "+j);
				break;		//내포된 두 번째 for 루프를 벗어남
			}
		}
	}

}
