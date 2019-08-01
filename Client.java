// 사용 예 : java Client 서버주소 포트번호
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String server = args[0];
		int port = Integer.parseInt(args[1]);
		Socket csocket = new Socket(server, port); //클라이언트 소켓생성(서버에 연결요청)
		InputStream istream = csocket.getInputStream(); //소켓 입력 스트림 생성
		DataInputStream distream = new DataInputStream(istream); //스트림 변환
		
		for(int i=1; i<=5; i++) {
			int imsg = distream.readInt(); //데이터 수신
			System.out.println("서버로부터 받은 데이터 : "+imsg);
		}
		csocket.close();
	}

}
