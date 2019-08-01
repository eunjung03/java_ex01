//생산자vs소비자 예제 프로그램
//생산자 쓰레드는 창고(버퍼)에 데이터를 저장하고, 소비자 쓰레드는 창고로부터 데이터를 가져옴

class pcBuffer{
	private int contents;
	private boolean available = false; 	//데이터 유무 플래그
	
	public synchronized void put(int value) { //임계영역
		while(available == true) {
			System.out.println("창고가 찼음. 생산자 : 대기 ");
		try {
			wait(); 	//다른 쓰레드에서 notify()를 실행해 줄 때까지 대기
			}
		catch(InterruptedException e) { /*nothing*/ }
	}
	contents = value;
	System.out.println("생산자 : 생산 "+contents);
	notify(); //대기 상태의 쓰레드에게 신호를 보냄
	available = true; //창고에 데이터 있음을 알림
	}
	public synchronized int get() {
		while(available == false) {
			System.out.println("창고가 비었음. 소비자 : 대기");
			try {
				wait(); //다른 쓰레드에서 notify()를 실행해 줄 때까지 대기
			}
			catch(InterruptedException e) { /*nothing*/ }
		}
		System.out.println("소비자 : 소비 "+contents);
		notify(); //대기 상태의 쓰레드에게 신호를 보냄
		available = false; //창고에 데이터 없음을 알림
		return contents;
	}
}
class Producer extends Thread{
	private pcBuffer b;
	public Producer(pcBuffer blank) { //생성자
		b = blank; //임계영역과 연결됨
	}
	public void run() {
		for(int i=1; i<=5; i++)
			b.put(i); //임계영역에 데이터를 전달
	}
}
class Consumer extends Thread{
	private pcBuffer b;
	public Consumer(pcBuffer blank) { //생성자
		b = blank; //임계영역과 연결됨
	}
	public void run() {
		int value = 0;
		for(int i=1;i<=5; i++)
			value = b.get(); //임계영역의 데이터를 가져옴
	}
}
public class ProducerConsumer {
	public static void main(String[] args) {
		pcBuffer buff = new pcBuffer(); //임계영역 갖는 오브젝트 생성
		Producer pro = new Producer(buff); //오브젝트생성(임계영역 전달)
		Consumer con = new Consumer(buff); //오브젝트생성(임계영역 전달)
		
		pro.start(); //생산자 쓰레드 실행
		con.start(); //소비자 쓰레드 실행

	}

}
