//보기에 주어진 문자열을 나누어서, 다음 결과와 같이 출력되는 프로그램을 작성하시오
//StringTokenizer 클래스를 이용하시오.
//보기 : 나랏말싸미, 문자와로, 서로, 사맛디, 아니할세, 듕귁에, 달아
//결과 : 나랏말싸미 듕귁에 달아 문자와로 서로 사맛디 아니할세

import java.util.*;

public class ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "나랏말싸미,문자와로,서로,사맛디,아니할세,듕귁에,달아";
		String word[] = new String[7];
		int n = 0;
		
		StringTokenizer t = new StringTokenizer(src,",");
		while(t.hasMoreTokens()) {
			word[n] = t.nextToken();
			n++;
		}
		System.out.print(word[0]+" "+word[5]+" "+word[6]+" ");
		System.out.println(word[1]+" "+word[2]+" "+word[3]+" "+word[4]);
	}

}
