// 사용법 : java InOut1 filename
import java.io.*;

public class InOut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = args[0];
			//바이너리 출력파일 오픈
			FileOutputStream out = new FileOutputStream(filename);
			//바이너리 입력파일 오픈
			FileInputStream file = new FileInputStream(filename);
			// 바이너리 입력 -> 문자
			InputStreamReader in = new InputStreamReader(file);
			
			for(byte i = 1; i <= 10; i++)
				out.write(i);	//파일에 바이너리(1바이트) 데이터 쓰기
								//2바이트 문자를 써도 1바이트만 저장됨
			out.close(); 		//파일닫기
			
			int c;
			while((c = in.read()) != -1)	//바이너리 데이터를 읽어 문자로 변환
				System.out.print(c+" ");	
			//InputStreamReder을 이용했기에 화면에 문자가 제대로 출력됨
			
			in.close(); 		//파일닫기
		}
		catch(Exception e) {
			System.out.println("파일을 지정하지 않았습니다.");
		}
	}

}
