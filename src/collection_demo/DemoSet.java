package collection_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {

    public void demoSet(){

        //SYNTAX :HashSet <Datatype> objectName=new HashSet();

        HashSet <String>  stringHashSet=new HashSet();

        stringHashSet.add("Java");
        stringHashSet.add("Java");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring Boot");
        stringHashSet.add("Spring Boot");

        stringHashSet.remove("Java");

        for (String var: stringHashSet){

            System.out.println("Printing hashset " +var );
        }

        HashSet <Integer> empIds= new HashSet<>();
        empIds.add(33);
        empIds.add(34);
        empIds.add(35);
        empIds.add(33);
        empIds.add(35);

        for (Integer var: empIds){
            System.out.println("Printing IDs "+var);
        }
    }

    public static void main(String[] args) {
        DemoSet obj=new DemoSet();

        obj.demoSet();
    }
}
