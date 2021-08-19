package method;

public class CalculatorWithInputParams {

    public void addition( int a, int b){

        int result=a+b;

        System.out.println("SUM is "+result);
    }

    public void mult(int a , int b){

        int result =a*b;
        System.out.println("Multiplication is "+result);
    }


    public static void main(String[] args) {

        CalculatorWithInputParams object= new CalculatorWithInputParams();

        object.addition(500,22);
        object.mult(25,25);
    }

}
