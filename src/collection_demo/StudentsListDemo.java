package collection_demo;

import model.Student;

import java.util.ArrayList;

public class StudentsListDemo {


    public void demo(){

        //SYNTAX : ArrayList <DataType> obj_name=  new ArrayList <DataType> ();

        ArrayList <Student>  studentArrayList= new ArrayList<>();

        // create student object using parametrized
        Student student1= new Student("John",25,"IT");
        studentArrayList.add(student1);//0 index

        Student student2= new Student("Rahul",23,"CS");
        studentArrayList.add(student2);// 1 index

        Student student3= new Student("Raj",23,"CS");
        studentArrayList.add(student3);// 2 index

        for (Student var: studentArrayList){

            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSection());
        }


    }

    public static void main(String[] args) {
        StudentsListDemo obj =new StudentsListDemo();
        obj.demo();
    }
}
