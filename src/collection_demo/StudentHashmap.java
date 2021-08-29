package collection_demo;

import model.Student;

import java.util.HashMap;

public class StudentHashmap {

    public void demo(){

        //SYNTAX:   HashMap <Datatype_Key, Datatype_Value> obj_Name= new HashMap()

        HashMap <Integer, Student> studentHashMap= new HashMap<>();

        Student student1= new Student("Java",23,"IT");
        Student student2= new Student("Spring",23,"IT");
        Student student3= new Student("Spring Boot",23,"IT");
        Student student4= new Student("Microservice",23,"IT");

        //add to map

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);
        studentHashMap.put(4,student4);

        // get

        Student student=studentHashMap.get(1);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSection());

        student=studentHashMap.get(2);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSection());

        student=studentHashMap.get(3);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSection());

        student=studentHashMap.get(4);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSection());


    }

    public static void main(String[] args) {

        StudentHashmap obj= new StudentHashmap();
        obj.demo();
    }
}
