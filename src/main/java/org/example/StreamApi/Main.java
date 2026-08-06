package org.example.StreamApi;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){


        //Creating stream from list.
        List<String> list = List.of("adfgt","ghjjkl","afjg","htyrb");
        Stream<String> stream = list.stream();
        System.out.println(stream.toList());

        //Creating stream from array.
        String[] arr = {"yrhab","ahhfu","hafy","jajkhd"};
        Stream<String> stream1 = Arrays.stream(arr).sorted();
        System.out.println(stream1.toList());

        //Creating stream using Stream.of().
        Stream<String> stream2 = Stream.of("utrd","anhfjd","jhfhh");
        System.out.println(stream2.toList());

        //Iterating through stream Stream.interate().
        Stream<Integer> integerStream = Stream.iterate(1,n->n+1);
        integerStream.limit(100).forEach(System.out::println);

        //filter() --> filter based on the condition.
        List<Integer> list1 = List.of(14,256,14,8,74,5,41,2,6,4,78,4,5,12,5,63,77);
        Stream<Integer> stream3 = list1.stream().filter(n->n%2==0);
        stream3.forEach(System.out::println);

        //map() --> transform each element
        List<String> strings = List.of("ask","talk","task");
        Stream<String> stream4 = strings.stream();
        stream4.map(String::toUpperCase).forEach(System.out::println);

        //flatMap() --> transform each element
        List<List<String>> lists = List.of(List.of("A","B"),List.of("C","D"));
        lists.stream().flatMap(List::stream).forEach(System.out::println);

        //distinct() --> remove duplicates
        List<Integer> integerList = List.of(1,1,2,4,5,1,2,4,6,2,5,7,8,9,6,4,1,3);
        Stream<Integer> integerStream1 = integerList.stream();
        integerStream1.distinct().forEach(System.out::print);

        //sorted() --> sort element.

        //Ascending
        List<Integer> integerList1 = List.of(1,1,2,4,5,1,2,4,6,2,5,7,8,9,6,4,1,3);
        Stream<Integer> integerStream2 = integerList1.stream();
        integerStream2.sorted().forEach(System.out::print);

        //Descending
        List<Integer> integerList2 = List.of(1,1,2,4,5,1,2,4,6,2,5,7,8,9,6,4,1,3);
        Stream<Integer> integerStream3 = integerList1.stream();
        integerStream3.sorted(Comparator.reverseOrder()).forEach(System.out::print);

        //skip() --> skip while iterating.
        Stream<Integer> integers = Stream.iterate(1,n->n+1).limit(10).skip(4);
        integers.forEach(System.out::println);
    }
}
