package org.example.multitreading;

public class ThreadMethodTut {
    public static void main(String[] args) {
        Thread thread = new Thread(new NewThread_());
        thread.start(); //create new thread
        thread.run();

        for(Integer i=2;i<Integer.MAX_VALUE/2;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for(Integer i=-1;i<Integer.MAX_VALUE/2;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


