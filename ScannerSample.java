import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src = new Scanner(System.in);
		
		System.out.println("역 이름을 입력하세요.");
		String stationName = src.next();	//데이터를 문자열로 가져온다.
		System.out.println("플랫폼 번호를 입력하세요.");
		int num = src.nextInt(); 	//데이터를 정수로 가져온다.
		
		src.close();
		
		System.out.println(stationName + "역 "+num+"번 홈입니다.");
	}

}
