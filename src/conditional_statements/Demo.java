package conditional_statements;

public class Demo {

  /*  if (condition)
    {
        //CODE
    }
    else{
        //CODE
    }*/

    public static void main(String[] args) {

        int age=9;

        if (age>10){
            System.out.println("Person is Young ....");
        }
        else {
            System.out.println("Person is Child ....");
        }

        double price=225.0;
        if(price >= 225.0){
            System.out.println("Product is costly ..");
        }
        else {
            System.out.println("Product is not costly ..");
        }

        String city="Delhi";

         if (city=="PUNE"){
             System.out.println("You are in Pune ....");
         }
         else
         {
             System.out.println("You are NOT in Pune ....");
         }



    }
}
