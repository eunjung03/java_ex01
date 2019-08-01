
public class Calc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] ID = {1001, 1002, 1003, 1004};
	int [] LA = {92, 95, 97, 96};
	int [] Math = {50, 85, 86, 98};
	int [] Eng =  {78, 96, 94, 67};
	int [] Sum = {0, 0, 0, 0};
	int [] Ave = {0, 0, 0, 0};
	
	int i = 0;
	
	for(i=0; i<4; i++)
		Sum[i] = LA[i] + Math[i] + Eng[i];
	
	for(i=0; i<4; i++)
		Ave[i] = Sum[i] / 3;
	
	System.out.println("학번     국어   수학    영어    총점    평균");
	for(i=0; i<4; i++) {
		System.out.print(ID[i]+"  "+LA[i]+"  "+Math[i]);
		System.out.println("  "+Eng[i]+"  "+Sum[i]+"  "+Ave[i]);
		}
	}
}
