
public class Ex4_3 {

	public static void main(String[] args) {

          byte a = 127 ;          // 0x7F
          short b = a ;

          System.out.printf("a = %d = %X, b = %d = %X \n",a,a,b,b) ; 

          b = 127 + 1 ;
          a = (byte) b ;

          System.out.printf("b = 127 + 1 ; a = (byte)b ; ½ÇÇà ÈÄ\n") ;
          System.out.printf("a = 0x%X = %d \n",a,a) ;
          System.out.printf("b = 0x%X = %d \n",b,b) ;

    }

}
/*