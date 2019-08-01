class WordThread extends Thread{
	private String word;
	private int time;
	private int count;
	
	public WordThread(String w, int t, int c) {//������
		word = w;
		time = t;
		count = c;
	}
	public void run() {
		for(int n = 0; n < count; n++) {
			System.out.println(word);
			try {
				Thread.sleep(time); //time �и��� ��ŭ ���� ������ ���
			}
			catch(Exception e) {
				//nothing
			}
		}
	}
	public static void main(String [] args) {
		WordThread tick = new WordThread("tick",1000,3);
		WordThread tack = new WordThread("tack",1000,2);
		
		tick.start();
		try {
			Thread.sleep(500); //500�и��ʸ�ŭ ������ ���
		}
		catch(Exception e) {
			//nothing
		}
		tack.start();
	}

}
