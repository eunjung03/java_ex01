//사용 예 : java Server 포트번호

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int port = Integer.parseInt(args[0]);
		ServerSocket ssocket = new ServerSocket(port); //서버 소켓 생성
		
		System.out.println("서버 실행 중...");
		while(true) {
			Socket csocket = ssocket.accept(); //연결수락, 클라이언트 소켓 생성
			OutputStream ostream = csocket.getOutputStream(); //소켓 출력 스트림 생성
			DataOutputStream dostream = new DataOutputStream(ostream); //스트림 변환
			
			for(int imsg = 1; imsg <= 5; imsg++)
				dostream.writeInt(imsg); //데이터 전송
			
			csocket.close();
		}

	}

}
