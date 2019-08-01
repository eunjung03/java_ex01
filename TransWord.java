// 사용법 : java TransWord 문자열
import java.io.*;

public class TransWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//텍스트 파일로부터 입력을 받기 위한 오브젝트 생성
			FileReader fin =new FileReader("mydic.txt");
			//행 단위로 데이터를 읽기 위한 오브젝트 생성
			BufferedReader in = new BufferedReader(fin);
			
			String a = args[0]; 	//찾는 문자열
			
			String eword, kword = null;
			
			while((eword = in.readLine()) != null) {
				if(a.equals(eword)) { //찾는 문자열과 입력 문자열 비교
					kword = in.readLine();
					break;
				}
			}
			if(kword == null)
				System.out.println(a+"이라는 단어는 없습니다.");
			else
				System.out.println(kword);
			
			in.close();
		}
		catch(Exception e){
			System.out.println("커맨드라인 인수가 없습니다.");
		}
	}

}
