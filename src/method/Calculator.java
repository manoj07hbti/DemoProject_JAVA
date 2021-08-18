package method;

public class Calculator {

    // add, sub a-b; , mul , divide a/b;

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void addition(){
        int a=10;
        int b=33;
        int result= a+b;

        System.out.println("Addition of two number is: " +result);
    }

    public void multi(){
        int a=10;
        int b=5;
        int result= a*b;

        System.out.println("Multiplication of two number is: " +result);
    }


    public static void main(String[] args) {
        Calculator object=new Calculator();
        object.addition();

        object.multi();

    }


}
