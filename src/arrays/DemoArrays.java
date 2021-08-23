package arrays;

public class DemoArrays {

    public void demo(){
        //  SYNTAX of  Array : DataType [] variable_name={,,,};

      String [] nameArray= {"Test","john","Java","Spring","Spring Boot"};

      for (int i=0; i<nameArray.length; i++){

          System.out.println(" Printing Array : " +nameArray[i] +" Printing index i : " +i );
      }

      // Advanced for Loop
       // Syntax:  for (Data_type var: ArrayName)

        for (String var : nameArray ){
            System.out.println("Inside advanced for loop "+var);
        }

       int [] marksArray={56,76,34,87,37,86,45,5,6,66};

        for (int var : marksArray){

            System.out.println(" inside marks array advanced loop " +var);
        }


    }

    public static void main(String[] args) {

        DemoArrays obj=new DemoArrays();
        obj.demo();
    }

}
