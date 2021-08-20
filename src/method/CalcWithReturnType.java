package method;

public class CalcWithReturnType {

    public int add (int a, int b){

        int result=a+b;

        return result;
    }

    public static void main(String[] args) {

        CalcWithReturnType obj= new CalcWithReturnType();
       int output= obj.add(6,5);
       System.out.println("Addition of a and b is :" +output);
    }
}
