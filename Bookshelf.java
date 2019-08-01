//클래스를 여러 서브 클래스로 상속한 경우
class Books__{
	String title;
	String janre;
	
	void PrintBooks__() {
		System.out.println("제 목: "+title);
		System.out.println("장 르: "+janre);
	}
}
class Novel extends Books__{
	String writer;
	
	void PrintNov() {
		PrintBooks__();	//슈퍼 클래스의 메소드 실행
		System.out.println("저 자: "+writer);
	}
}
class Magagine extends Books__{
	int day;
	void PrintMag() {
		PrintBooks__();
		System.out.println("발매일: "+day+"일");
	}
}
public class Bookshelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Novel nov = new Novel();	//Novel 클래스의 객체 생성
	
	nov.title = "구운몽";		//Books__ 클래스의 필드
	nov.janre = "고전문학";	//Books__ 클래스의 필드
	nov.writer = "김만중";	//Novel 클래스의 필드
	nov.PrintNov();			//Novel 클래스의 메소드
	
	System.out.println("------------");
	
	Magagine mag = new Magagine();		//Magagine 클래스의 객체 생성
	
	mag.title = "씨네21";		//Books__ 클래스의 필드
	mag.janre = "영화잡지";	//Books__ 클래스의 필드
	mag.day = 20;			//Magagine 클래스의 필드
	mag.PrintMag();			//Magagine 클래스의 메소드
	
	}

}
