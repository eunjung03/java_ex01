//사용방법 : java MyException 숫자
class MyException1 extends Exception{
	//nothing
}
class MyException2 extends Exception{
	//nothing
}
public class MyExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyMethod(args[0]);
		}
		catch(MyException1 e1) {
			System.out.println("예외1");
		}
		catch(MyException2 e2) {
			System.out.println("예외2");
		}
		finally {
			System.out.println("끝");
		}
	}
	static void MyMethod(String str) throws MyException1, MyException2{
		System.out.print("입력값은 "+str+"입니다.");
		int x = Integer.parseInt(str);	//문자열을 정수로 변환
		switch(x) {
			case 1:
				throw new MyException1();	//예외 발생시킴
			case 2:
				throw new MyException2();	//예외 발생시킴
			default:
				System.out.println("예외 없음");
		}
	}
}
