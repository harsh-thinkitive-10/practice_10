package org.example.multitreading;

public class Treads{
    public static void main(String[] args) {
        T t = new T();
        t.run();

    }

}
class T implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
