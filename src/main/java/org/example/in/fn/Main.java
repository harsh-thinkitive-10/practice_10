package org.example.in.fn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        //predicate used for testing conditions

        /*
        * Its take the input and give the boolean output and contains a abstract method  test()
        */

        Predicate<Integer> isEven = (a) -> a%2==0;
        System.out.println(isEven.test(8));

        Predicate<Integer> greater = a ->a>10;
        Predicate<Integer> lesser = a->a<20;

        Predicate<Integer> result = greater.and(lesser);
        System.out.println(result.test(20));


        //function transform one value into another
        /*
            it takes the value as input  and change it into another value. return value abstract method apply()
         */
        Function<String,Integer> length = String::length;
        System.out.println(length.apply("abc"));

        //consume takes the input but does not return any value
        /*
            it takes the input and doesn't return the value abstract method accept()
         */

        Consumer<String> print = System.out::println;
        print.accept("Harsh");

        //supplier produce the values and does not take the input abstract method get()
        Supplier<Double> num = Math::random;
        System.out.println(num.get());
    }
}


