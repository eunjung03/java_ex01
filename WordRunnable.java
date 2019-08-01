
class WordRunnable implements Runnable {
	private String word;
	private int time;
	private int count;
	
	public WordRunnable(String w, int t, int c) { //생성자
		word = w;
		time = t;
		count = c;
	}
	public void run() {
		for(int n =0; n < count; n++) {
			System.out.println(word);
			
			try {
				Thread.sleep(time); //time밀리초만큼 현재 쓰레드 대기
			}
			catch(Exception e) {
				//nothing
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordRunnable tick = new WordRunnable("tick",1000,3);
		WordRunnable tack = new WordRunnable("tack",1000,2);
		Thread tickThread = new Thread(tick);
		Thread tackThread = new Thread(tack);
		
		tickThread.start();
		try {
			Thread.sleep(500); //500밀리초만큼 쓰레드 대기
		}
		catch(Exception e) {
			//nothing
			}
		tackThread.start();
		}

}
