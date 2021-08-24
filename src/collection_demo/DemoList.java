package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public void demo(){
     // SYNTAX : ArrayList obj_name=  new ArrayList();

        List list = new ArrayList();

        list.add("Rahul");// 0 index
        list.add("Ramesh");// 1 index
        list.add("John");// 2 index

        System.out.println("Printing element using get " +list.get(0));
        System.out.println("Printing element using get " +list.get(1));
        System.out.println("Printing element using get " +list.get(2));

        // advanced for loop for (Datatype var : collection/array){CODE}

        for( Object var: list){
            System.out.println(var);
        }

        list.remove(0);

        for( Object var: list){
            System.out.println("after delete " +var);
        }


    }

    public static void main(String[] args) {
        DemoList obj = new DemoList();
        obj.demo();
    }
}
