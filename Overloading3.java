class OL_Calc3{
	short add(short a, int b) {
		System.out.printf("short add(%d, %d)가 호출됨\n",a,b);
		return (short)(a+b);
	}
	int add(int a, int b) {
		System.out.printf("int add(%d, %d)가 호출됨\n",a,b);
		return a+b ;
	}
	int add(int a, int b, int c) {
		System.out.printf("int add(%d, %d, %d)가 호출됨\n",a,b,c);
		return a+b ;
	}
}
public class Overloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OL_Calc3 oc = new OL_Calc3();
		
		oc.add((short)1, 2);	//short add(int a, int b) 호출
		oc.add(1, 2, 3);		//add(int a, int b, int c)
		
		//다음 코드는 애매한 경우(사용하지 않는 것이 좋음)
		oc.add(1, (short)2);			// int add(int a, int b)로 호출. 
		oc.add((short)1,(short)2);		// short add(short a, short b)
	}

}
