class OL_Calc2{
	short add(short a, short b) {
		System.out.printf("int add(%d, %d)∞° »£√‚µ \n",a,b);
		return (short)(a+b);
	}
	int add(int a, int b, int c) {
		System.out.printf("int add(%d, %d, %d)∞° »£√‚µ \n",a,b,c);
		return a+b ;
	}
	float add(int a, float b) {
		System.out.printf("float add(%d, %f)∞° »£√‚µ \n",a,b);
		return a+b ;
	}
}
public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OL_Calc2 oc = new OL_Calc2();
		
		oc.add(1, 2);			//short add(short a, short b)
		oc.add(3, 4, 5);		//int add(int a, int b, int c)
		oc.add(5, 6.0f);		//float add(int a, float b)
	}

}
