
public class Ex05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a[] = new int[6] ;

	    int temp = 0 ;

	    a[0] = 5 ; a[1] = 2 ; a[2] = 9 ; a[3] = 4 ; a[4] = 13 ; a[5] = 6 ;

	    for(int m = 0; m < a.length; m++)  {
	          temp = a[m] % 2 ;

	      switch(temp)  {

	        case 0 :
	          System.out.printf("�迭�� %d�� ���� %d�� ¦���Դϴ�.\n",m,a[m]);
	          break ;

	        case 1 :
	          System.out.printf("�迭�� %d�� ���� %d�� Ȧ���Դϴ�.\n",m,a[m]);
	          break ;
	         }
	    }
	}
}
