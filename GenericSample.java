import java.util.*;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		List list = new ArrayList();	//자료형을 지정 않음
		//List <Integer> list = new ArrayList <Integer> ();	//자료형을 지정함
		
		for(n=0;n<5;n++)
			list.add(n*3);
		
		System.out.println(list);
		
		for(n=0;n<list.size();n++)
			System.out.print(" "+list.get(n)+" ");//unsafe operation 경고
	}

}
