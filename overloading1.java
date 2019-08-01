class OL_Calc{
	byte add(byte a, byte b) {
		System.out.printf("byte add(%d, %d)∞° »£√‚µ \n",a,b);
		return (byte)(a+b);
	}
	int add(int a, int b) {
		System.out.printf("int add(%d, %d)∞° »£√‚µ \n",a,b);
		return a+b ;
	}
	float add(float a, float b) {
		System.out.printf("float add(%f, %f)∞° »£√‚µ \n",a,b);
		return a+b ;
	}
	double add(double a, double b) {
		System.out.printf("double add(%f, %f)∞° »£√‚µ \n",a,b);
		return a+b ;
	}
}
public class overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OL_Calc oc = new OL_Calc();
		
		oc.add((byte)1, (byte)2);
		oc.add(3, 4);
		oc.add(5.0f, 6.0f);
		oc.add(7.12, 8.34);
		
	}

}
