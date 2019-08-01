import java.net.*;
import java.io.*;
import java.util.*;

public class URLConnectionTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		URL w3c = new URL("http://www.w3.org/");
		URLConnection w3cCon = w3c.openConnection();
		
		System.out.println("문서의 타입 : "+ w3cCon.getContentType());
		System.out.println("최종 수정일자 : "+new Date(w3cCon.getLastModified()));
		
		System.out.println("문서 내용 : ");
		InputStream input = w3cCon.getInputStream();
		
		int i = 500;
		int c;
		while(((c = input.read()) != -1)&&(--i > 0)) {
			System.out.print((char)c);
		}
		input.close();
	}

}
