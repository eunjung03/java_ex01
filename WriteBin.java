// 사용법 : java WriteBin Filename
import java.io.*;

public class WriteBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream out = new FileOutputStream(args[0]);	//파일열기
			byte x;
			
			for(x = 48; x <= 57; x++)	//숫자 0~9
				out.write(x); 	//파일에 1바이트 쓰기(ASCII 코드)
			out.write('\n');
			for(x = 65; x <= 90; x++)	//영문 대문자 A~Z(ASCII 코드)
				out.write(x);
			
			out.close(); 	//파일 닫기
		}
		catch(Exception e) {
		System.out.println("파일을 지정하지 않았습니다.");
		}
	}

}
