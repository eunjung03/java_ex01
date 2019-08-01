
public class VarargsSample {

	int getMax(int ... nums)
	{
		int max = 0;
		for(int i = 0; i<nums.length; i++) {
			if(i==0) {
				max = nums[0];
			}
			if(max<nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VarargsSample vt = new VarargsSample();	//��ü(�ν��Ͻ�)�� ����
		
		System.out.println("(3,5,7,0,1) �ִ밪 : "+ vt.getMax(3,5,7,0,1));
		System.out.println("  (10,50,7) �ִ밪 : "+ vt.getMax(10,50,7));
		System.out.println("        (2) �ִ밪 : "+ vt.getMax(2));
	}

}
