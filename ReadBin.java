// 사용법 : java ReadBin filename
import java.io.*;

public class ReadBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream(args[0]);	//파일열기
			int c;
			String s = new String();
			while((c = in.read()) != -1)	//파일로부터 1바이트 읽기
				s = s + (char) c;			//입력 문자를 s에 추가
			System.out.print(s);
			in.close();						//파일닫기
		}
		catch(FileNotFoundException e) {	//IOException의 하위클래스
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(Exception e) {	
			System.out.println("파일을 지정하지 않습니다.");
		}
	}

}
