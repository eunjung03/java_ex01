interface Super  {
     void printmsg_super(); //{  }
}
interface Sub {
     void printmsg_sub() ;
}
class Super_Sub implements Super/*;*/, Sub  { 
      public void printmsg_super() {
            System.out.println("���� Ŭ�����Դϴ�") ;
  }
      public void printmsg_sub() {
            System.out.println("���� Ŭ�����Դϴ�") ;
  }
}
class Ex10_2 {
      public static void main(String[] args) {
 
    	   Super_Sub SS = new Super_Sub ( ) ;
           SS.printmsg_super() ;
           SS.printmsg_sub() ;

      }

}

