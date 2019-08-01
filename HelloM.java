//현재 작업 폴더에서 HelloM.java 저장
import a.AHello;	//package a의 AHello 클래스를 참조

public class HelloM{
	public static void main(String [] args){
		AHello h = new AHello();
		h.hello();	// AHello클래스의 객체 h의 hello() 메소드 호출
}
}

