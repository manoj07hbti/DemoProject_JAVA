package collection_demo;

import model.Student;

import java.util.HashSet;

public class SetWithStudent {

    public void demo (){

        //SYNTAX :HashSet <Datatype> objectName=new HashSet();

        HashSet <Student> studentHashSet=new HashSet<>();
        Student student1= new Student("Java",23,"IT");
        Student student2= new Student("Spring",23,"IT");
        Student student3= new Student("Spring Boot",23,"IT");
        Student student4= new Student("Microservice",23,"IT");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for(Student var : studentHashSet){

            System.out.println(var.getName());

        }

    }

    public static void main(String[] args) {
        SetWithStudent obj= new SetWithStudent();
        obj.demo();
    }
}
