// 사용법 : java ReadText filename

import java.io.*;

public class ReadText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader in = new FileReader(args[0]);	//파일열기
			int c;
			String s = new String();
			while((c = in.read()) != -1)	//파일로부터 데이터 읽기
				s = s + (char) c;			//입력 문자를 s에 추가
			System.out.print(s);
			in.close(); 					//파일 닫기
		}
		catch(IOException ie) {	//파일이 없는경우
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(Exception e) {	//파일이 지정하지 않았을때
			System.out.println("파일을 지정하지 않았습니다.");
		}
	}

}
