//사용방법 : java Args [인수]
public class Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//같은 클래스내의 static멤버이므로 오브젝트 생성없이 back() 직접 호출가능
			back(args[0]);	//인수가 없으면 예외발생
		}
		catch (Exception e) {
			System.out.println("커맨드라인 인수가 없습니다.");
		}
		finally {
			System.out.println("종료합니다.");
		}
	}
	static void back(String a) throws Exception{
		System.out.println("커맨드라인 인수는 "+a+"입니다.");
	}
}
