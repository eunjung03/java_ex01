interface Super  {
     void printmsg_super(); //{  }
}
interface Sub {
     void printmsg_sub() ;
}
class Super_Sub implements Super/*;*/, Sub  { 
      public void printmsg_super() {
            System.out.println("상위 클래스입니다") ;
  }
      public void printmsg_sub() {
            System.out.println("하위 클래스입니다") ;
  }
}
class Ex10_2 {
      public static void main(String[] args) {
 
    	   Super_Sub SS = new Super_Sub ( ) ;
           SS.printmsg_super() ;
           SS.printmsg_sub() ;

      }

}

