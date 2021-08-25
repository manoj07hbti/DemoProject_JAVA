package collection_demo;

import java.util.ArrayList;

public class DemolistWithGenerics {

    public void demo(){

        //SYNTAX : ArrayList <DataType> obj_name=  new ArrayList <DataType> ();

        ArrayList <String> listNames= new ArrayList<String>();// compile time safety

        listNames.add("Java");
        listNames.add("Spring");
        listNames.add("SPRING BOOT");


        for (String var: listNames){

            System.out.println("Printing name: "+var);
        }

        ArrayList <Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(33);
        integerArrayList.add(324);
        integerArrayList.add(12);

        for (Integer var: integerArrayList){

            System.out.println("Printing integerArrayList: "+var);
        }


    }

    public static void main(String[] args) {
        DemolistWithGenerics obj=new DemolistWithGenerics();// Default constructor

        obj.demo();

    }




}
