//복제 생성자
class BS{
	String title;
	String writer;
	
	BS(String t, String w){	//클래스 BS의 생성자
		title = t;
		writer = w;
	}
	BS(BS copy){	//클래스 BS의 복제 생성자
		title = copy.title;
		writer = copy.writer;
		System.out.println("복제 생성자 실행");
	}
	void print() {
		System.out.println("제 목: "+title);
		System.out.println("저 자: "+writer);
	}
}
public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BS book1 = new BS("태백산맥","조정래");
		System.out.println("---book1---");
		book1.print();
		
		BS book2 = new BS(book1);	//복제 생성자
		System.out.println("---book2---");
		book2.print();
		
		book2.title = "아리랑";
		System.out.println("---book2---");
		book2.print();
	}

}
