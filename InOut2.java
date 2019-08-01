// 사용법 : java InOut2 filename
import java.io.*;

public class InOut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = args[0];
			// 바이너리 출력파일 오픈
			FileOutputStream fout = new FileOutputStream(filename);
			// 바이너리 출력 -> 문자출력
			OutputStreamWriter out = new OutputStreamWriter(fout); 
			
			String han = "문자 스트림으로 변환하기 OutputStreamWriter 클래스";
			out.write(han);	//파일에 바이너리 데이터(문자열) 쓰기
			// OutputStreamWriter을 사용하지 않았다면 문자열을 바이너리 파일에 쓸 수 없음
			
			out.close();	//파일닫기
		}
		catch(Exception e)
		{
			System.out.println("파일을 지정하지 않았습니다");
		}
	}

}
