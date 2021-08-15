package conditional_statements;

public class Day2 {

    public static void main(String[] args) {

     int age=16;
     String city="AGRA";

     // AND OPERATOR
     if(age>15 && city=="AGRA" ){

         System.out.println("This Person is Adult and live in Agra City");
     }
     else {
         System.out.println("This Person is NOT Adult and NOT live in Agra City");
     }

     // OR OPERATOR
     if( age>10 || city=="DELHI"){

         System.out.println("This Person age is more than 10  and NOT live in Agra City");
     }
     else {
         System.out.println("inside else block of OR Operator");
     }
     //NOT OPERATOR

     if (!(age<10) ){
         System.out.println("INSIDE IF BLOCK OF NOT OPR");
     }
     else {
         System.out.println("INSIDE ELSE BLOCK OF NOT OPR");
     }


    }

}
