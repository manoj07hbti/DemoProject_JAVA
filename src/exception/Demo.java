package exception;

public class Demo {

    public void divide(int a, int b){

        int result=0;
        try {
             result = a / b;
        }
        catch (Exception e){

           System.out.println("Exception occurred but handled "+e);
        }
        finally {
            System.out.println("This is finally block and it gets executed every time");
        }
        System.out.println("Result "+result);


    }

    public void throwException() throws Exception {

        throw new Exception();
    }

    public static void main(String[] args) {
        Demo obj= new Demo();
        obj.divide(8,2);

        try {
            obj.throwException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
