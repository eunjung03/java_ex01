class Study_1{
	String name;
	String teacher;
	
	void printmsg() {
		System.out.println("�� �� : "+name);
		System.out.println("�� �� : "+teacher);
	}
}	
class Sub_Java extends Study_1{
	int credit;
	String room;
	
	void printJV() {
		printmsg();
		System.out.println("�� �� : "+credit);
		System.out.println("���ǽ� : "+room);
	}
}
public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_Java SJ = new Sub_Java();
		SJ.name = "�ڹ�";
		SJ.credit = 3;
		SJ.room = "R123";
		SJ.teacher = "�ѻ��";
		
		SJ.printJV();
		
		
	}

}
