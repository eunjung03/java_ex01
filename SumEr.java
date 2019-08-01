
public class SumEr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, i = 0;
		
		do {
	// i값을 증가시키는 코드가 없으므로 무한히 실행된다.
			sum += i;
			System.out.println("1 ~ "+i+ "의 합은 = "+sum);
		} while(i<10);
	}
}
	// 프로그램의 실행을 종료시키려면 Ctrl키를 누른 상태에서 c키를 누른다
