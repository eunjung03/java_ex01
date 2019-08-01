class Point{
	private int total = 0;
	synchronized void goalin(int point) { //임계영역
		total += point;
	}
	int gettotal() {
		return total;
	}
}
class Player extends Thread{
	Point goal;	//임계영역과 아직 연결 안 됨
	Player(Point number){
		goal = number;	//임계영역과 연결됨
	}
	public void run() {
		try {
			for(int n=0; n<100; n++) {
				int pt = (int)(Math.random()*10)%3+1; 	//점수생성
				goal.goalin(pt); //임계영역에 점수 전달
				System.out.println("선수("+getName()+") = "+pt+"점");
				
				int sleep_time = (int)(Math.random()*10);
				sleep(sleep_time);	//다른 쓰레드 실행을 위해 잠시 대기
				if(goal.gettotal() >= 20) break; //게임 종료
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point jeomsu = new Point(); //임계영역 갖는 오브젝트 생성
		Player [] seonsu = new Player[5]; //배열선언
		for(int n=0; n<5; n++) {
			seonsu[n] = new Player(jeomsu); //오브젝트생성(임계영역 전달)
			seonsu[n].start(); //쓰레드 실행
		}
		for(int n=0; n<5; n++) {
			try {
				seonsu[n].join(); //모든 쓰레드 종료를 대기
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("총 득점은 : "+jeomsu.gettotal()+"점");
	}

}
