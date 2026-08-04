package org.example;

public class Main {
    public static void main(String[] args) {
            //single line comments

        /*
        Multi-line comments
         */

        /**
         * Java Docs
         */

        int a; //declared

        a = 10; //initialisation

        int b = 25; //single line initialisation

        /*
        *  Primitive data types (store actual values in stack area)
        *
        * java has 8 built in datatypes
        *
        * byte   --> 1 byte
        * short  --> 2 byte
        * int    --> 4 byte
        * long   --> 8 byte
        * float  --> 4 bytes
        * double --> 8 bytes
        * char   --> 2 bytes
        * boolean--> 1 bit
        *
        * */

        /*  reference vs primitive type
            reference --> stores the address of the object present in heap area
            primitive type stores the actual value
        * */

        //Type Casting

        /*
        1. Implicit Casting(Widening)

        Converting smaller data type into larger data type
        it done by compiler.
        it is safe.

        */

        /*
        2. Explicit Casting(Narrowing)

        Converting larger data type into smaller data type
        its done manually.
        data may loose.
        */
    }
}