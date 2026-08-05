package org.example.multitreading;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        Thread thread = new Thread(new New_Thread());
        System.out.println(thread.getState());

        thread.start();
        thread.start();
        System.out.println(thread.getState());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            synchronized (thread){
                thread.wait(100);
                System.out.println(thread.getState());

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.isAlive());

        System.out.println(thread.getState());

    }
}

class New_Thread implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread is running.");
            Thread.sleep(1000);
            System.out.println("Thread is terminate.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
