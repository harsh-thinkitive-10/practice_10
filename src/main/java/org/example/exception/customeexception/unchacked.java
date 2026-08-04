package org.example.exception.customeexception;

public class unchacked {
    public static void main(String[] args) {
        Student student = new Student(10,"abc");
        findstudent.find_student(student,11);
    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class findstudent extends Throwable{
    public static void find_student(Student student,int sid){
        if(student.id==sid){
            System.out.println("find");
        }else {
            throw new RuntimeException("not found");
        }
    }
}
