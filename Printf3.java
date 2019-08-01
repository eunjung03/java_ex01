
public class Printf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("12345679-칸수를 세기 위한 번호\n");
		
		System.out.printf("%d \n",3);		// 자동으로 표시 자리수 결정됨
		System.out.printf("%+d \n",3);		// 부호 표시
		System.out.printf("%d = %d \n",1+2,3);
		System.out.printf("%4d \n",25);		// 표시 자리수는 4칸
		System.out.printf("%04d \n",25);	// 빈 칸은 0으로 채움
		System.out.printf("%4.1f \n",2.5);  // 전체 자리 4자리, 소숫점 1자리
		System.out.printf("%04.1f \n",2.5);	// 빈 칸은 0으로 채움
		System.out.printf("%8.1e \n",2.5);	// 10의 지수 형태로 표시
	}

}
