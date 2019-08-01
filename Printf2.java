
public class Printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("1234567890-칸수를 세기 위한 번호\n");
		System.out.printf("%c \n",'a');		// 자동으로 표시 자리수 결정됨
		System.out.printf("%3c \n",'a');	// 표시 자리수는 3칸, 오른쪽 맞춤
		System.out.printf("%-3c \n",'a');	// 표시 자리수는 3칸, 왼쪽 맞춤
		
		System.out.printf("%s \n","abc");	//자동으로 표시 자리수 결정됨
		System.out.printf("%5s \n","abc");	// 표시 자리수는 5칸, 오른쪽 맞춤
		System.out.printf("%-5s \n","abc");	// 표시 자리수는 5칸, 왼쪽 맞춤
	
	}

}
