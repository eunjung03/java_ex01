import java.io.*;

class ex11_03  {

   public static void main(String[] args)  {
 
	 int c = 0 ;
     String s = "" ;

     try  {
       FileReader in = new FileReader("File.txt") ;

       while ( (c = in.read()) != -1 )  {
             s = s + (char) c ;
       }
       System.out.println(s) ;
       in.close() ;
    }
    catch(Exception e)  {
          System.out.println(e) ;
    }
  }
}