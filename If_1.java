
public class If_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=-5, ax=x;
		int y=5, ay=y;
		
		if(x<0)			//조건식의 결과는 참이므로
			ax = -x;	// 실행됨
		
		System.out.printf("abs(%d) = %d\n",x,ax);
		
		if (y<0)		//조건식의 결과 거짓
		{
			ay = -y;	// 실행 안됨
			ay = -y;	// {}의 사용 보이려고 일부러 한 번 더 표시한 것
		}
		
		System.out.printf("abs(%d) = %d\n",y,ay);
	}

}
