package org.example.exception;


/*
    unchecked exception is resolve ar runtime.
    not mandatory to handle.
* */
public class unchecked {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.charAt(3));

        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
