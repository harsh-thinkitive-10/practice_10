package org.example.exception.customeexception;

public class chacked {
    public static void main(String[] args) {

    }
    public static void checkNum(int num){
        Check.check(num);
    }
}

class Check extends Throwable{
   Check(String msg){
       super(msg);
   }

   public static void check(int num) throws ArithmeticException{
       if(num>0){
           System.out.println("valid");
       }else {
           throw new ArithmeticException("invlaid");
       }
   }
}


