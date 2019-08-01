// 사용 예 : java UDPClient 포트번호
import java.net.*;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int port = Integer.parseInt(args[0]);
		DatagramSocket ds = new DatagramSocket(port); //소켓 생성
		String q;
		
		do {
			byte buffer[] = new byte[60];
			//패킷 오브젝트 생성
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
			
			ds.receive(dp); //패킷 수신
			String msg = new String(dp.getData()); //바이트 배열을 문자열로 변호나
			System.out.println("수신 메세지 : "+msg);
			
			q = msg.substring(0,3);
		}while(!q.contentEquals("bye"));
		
		ds.close(); //소켓 닫음
	}

}
