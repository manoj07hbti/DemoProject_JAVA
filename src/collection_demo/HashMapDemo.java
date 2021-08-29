package collection_demo;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {


    public void demo(){

        //SYNTAX:   HashMap <Datatype_Key, Datatype_Value> obj_Name= new HashMap()

        HashMap <Integer, String> hashMap = new HashMap<>();

        //adding element
        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");

        // get method
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));

        HashMap <String, String> stringHashMap = new HashMap<>();

        stringHashMap.put("A","Pune");
        stringHashMap.put("B","Delhi");
        stringHashMap.put("C","Agra");

        System.out.println(stringHashMap.get("A"));
        System.out.println(stringHashMap.get("B"));
        System.out.println(stringHashMap.get("C"));

    }

    public static void main(String[] args) {
        HashMapDemo obj= new HashMapDemo();
        obj.demo();
    }
}
