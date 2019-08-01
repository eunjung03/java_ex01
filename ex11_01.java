import java.io.*;

public class ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try {
	    IOException() ;
	    System.out.println("첫 번째 출력") ;
	}
	catch (Exception e) {
	    System.out.println("두 번째 출력") ;
	}
	catch (IOException ie) {
	    System.out.println("세 번째 출력") ;
	}
	finally {
	    System.out.println("네 번째 출력") ;
	}
	    System.out.println("다섯 번째 출력") ;
	}
}
