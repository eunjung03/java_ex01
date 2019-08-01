// 사용법 : java WriteText filename

import java.io.*;

public class WriteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter out = new FileWriter(args[0]);	//파일 열기
			int a = 10, b = 5;
			out.write("덧셈: ");	//파일에 문자열 쓰기
			out.write(a+" + "+b+" = "+(a+b)+"\n");
			out.write("뺄셈: ");	
			out.write(a+" - "+b+" = "+(a-b)+"\n");
			
			out.close();	//파일 닫기
		}
		catch(Exception e) {
			System.out.println("파일을 지정하지 않았습니다.");
		}
	}

}
