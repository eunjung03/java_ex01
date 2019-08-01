//사용법 : java ReadBin2B filename
import java.io.*;

public class ReadBin2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//바이너라 파일 열기
			FileInputStream in = new FileInputStream(args[0]);
			int c;
			while((c = in.read()) != -1)	//파일로부터 1바이트 읽기
				System.out.printf("%02X ",c);	//16진수로 화면에 출력
			in.close();
		}
		catch(IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
