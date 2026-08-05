package org.example.multitreading;

public class ThreadTut {
    public static void main(String[] args) {
            NewThread newThread = new NewThread();
            newThread.start();
            newThread.setName("One");  //.setName()--> set the name for the thread.

            NewThread_ newThread_= new NewThread_();
            newThread_.run();

            Thread thread = new Thread(new NewThread_());
            thread.start();
            thread.setName("Two");
    }
}

class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running using Thread");
        System.out.println(Thread.currentThread().getName());  //.getName()--> get the name of the thread.
//        throw new RuntimeException("executing using Thread");
    }

}

class NewThread_ implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable");
        System.out.println(Thread.currentThread().getName());
//        throw new RuntimeException("executing using Runnable");
    }
}
