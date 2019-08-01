
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		if( args.length == 0)	//배열 args의 요소수
			System.out.println("커맨드라인 인수가 없습니다.");
		else
			for(i=0; i<args.length; i++)
				System.out.println((i+1)+": "+args[i]);	//입력된 인수를 출력
	}

}
