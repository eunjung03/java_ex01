class Study_1{
	String name;
	String teacher;
	
	void printmsg() {
		System.out.println("과 목 : "+name);
		System.out.println("교 수 : "+teacher);
	}
}	
class Sub_Java extends Study_1{
	int credit;
	String room;
	
	void printJV() {
		printmsg();
		System.out.println("학 점 : "+credit);
		System.out.println("강의실 : "+room);
	}
}
public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_Java SJ = new Sub_Java();
		SJ.name = "자바";
		SJ.credit = 3;
		SJ.room = "R123";
		SJ.teacher = "한사대";
		
		SJ.printJV();
		
		
	}

}
