package org.example.javaeightplus;

import java.util.ArrayList;
import java.util.Collections;

public class lamda {
    public static void main(String[] args) {
        Greet g = ()-> System.out.println("Hello");
        g.greetMsg();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,15);
        list.add(4,35);

        System.out.println(list);

        Collections.sort(list,(a,b)->a-b);

        list.forEach(num-> System.out.println(num));

    }
}

interface Greet{
    void greetMsg();
}
interface Add{
    int add();
}

