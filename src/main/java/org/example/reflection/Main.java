package org.example.reflection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> student = Student.class;
        System.out.println(student);

        Student student1 = new Student();
        Class<?> student2 = student1.getClass();
        System.out.println(student2);

        Class<?> student3 = Class.forName("org.example.reflection.Student");
        System.out.println(student3);

        System.out.println(student.getName());
        System.out.println(student.getSimpleName());
        System.out.println(student.getSuperclass());


        try {
            Class<Student> student4 = Student.class;
            Student student5 = student4.getConstructor().newInstance();
            System.out.println(student5);

        }catch (Exception e){
            e.printStackTrace();
        }




    }
}

class Student{
    public Student() {
        System.out.println("Constructor called");
    }
}
