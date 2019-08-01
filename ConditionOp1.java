
public class ConditionOp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String right = "맞음", wrong = "틀림";
		boolean value;
		
		value = true;
		String answer = value ? right : wrong;
		System.out.println(answer);
		
		value = false;
		answer = value ? right : wrong;
		System.out.println(answer);	
	}

}
