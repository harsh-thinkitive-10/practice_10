package org.example.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //1. Optioanl.of() --> used when the value is definitely not null.
        //if the values is null --> throws exception
        // Optional.of() --> never accepts null values
        String name = "Harsh";
        Optional<String> str = Optional.of(name);
        System.out.println(str);

        try{
            String str1 = null;
            Optional<String> str2 = Optional.of(str1);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        //2.Optional.ofNullable() --> accepts both null and not null
        String str3 = null;
        Optional<String> string = Optional.ofNullable(str3);
        System.out.println(string);  //if the value is null then return Optional.empty

        String string1 = "Java";
        Optional<String> string2 = Optional.ofNullable(string1);
        System.out.println(string2);  //Optional[Java]

        //3. empty() --> create a empty Optional
        Optional<String> string3 = Optional.empty();
        System.out.println(string3);


        //4. isPresent() --> check whether the value present or not
        Optional<String> string4 = Optional.of("Python");
        System.out.println(string4.isPresent());

        //5. get() --> return the value
        Optional<String> string5 = Optional.of("React");
        System.out.println(string5.get());

        //6. ifPresent() --> execute if the values present
        Optional<String> string6 = Optional.of("Spring");
        string6.ifPresent(System.out::println);

        //7. orElse() --> return the value of present or return te default value
        Optional<String> string7 = Optional.ofNullable(null);
        Optional<String> string8 = Optional.ofNullable("SQl");

        String string9 = string7.orElse("HELLO");
        String string10 = string8.orElse("HELLO");

        System.out.println(string9);
        System.out.println(string10);

        //8. orElseGet() --> provides lazy value using supplier
        Optional<String> string11 = Optional.ofNullable(null);
        String string12 = string11.orElseGet(()-> "Default");
        System.out.println(string12);


        //9. orElseThrow() --> throws exception if the value is not present
        Optional<String> string13 = Optional.of("Java");
        String string14 = string13.orElseThrow(RuntimeException::new);
        System.out.println(string14);

        //10. filter() --> return the value of the condition is stratified.
        Optional<String> string15 = Optional.ofNullable("Harsh");
//        String string16 = string15.filter();

        //11. map() --> transform the contain value.
        Optional<String> string17 = Optional.of("Harsh");


    }
}
