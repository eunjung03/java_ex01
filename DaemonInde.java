class DaeA extends Thread{
	public void run() {
		System.out.println("Daemon Thread A 시작");
		try {
			Thread.sleep(700); //time 밀리초만큼 현재 쓰레드 대기
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("Daemon Thread DaeA 끝");
	}
}
class DaeB extends Thread{
	public void run() {
		System.out.println("독립 Thread DaeB 시작");
		try {
			Thread.sleep(10000); //time 밀리초만큼 현재 쓰레드 대기
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("독립 Thread DaeB 끝");
	}
}
public class DaemonInde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Thread 시작");
		
		DaeA threadA = new DaeA();
		DaeB threadB = new DaeB();
		
		threadA.setDaemon(true); //데몬 쓰레드로 지정함
		threadB.setDaemon(false); //독립 쓰레드로 지정함
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(500); //time밀리초만큼 현재 쓰레드 대기
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("main Thread 끝");
	}

}
