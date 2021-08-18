package method;

public class DemoMethods {

    /* todo    Member function or method -- capabilities
        // Syntax : access_specifier return_type  method_name (parameter) {CODE}
         //access_specifier -> public , private , protected , default   THEORY PART
         //return_type   -> output of method/function :  void : no return
         //method/function_name -> can be anything but it should be meaningful
          // parameter ->  input parameter : optional
*/

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void demo (){

        System.out.println("This is Demo Method....");
    }

    public static void main(String[] args) {
        //1 create  object of class
        DemoMethods object= new DemoMethods();
        //2 object.methodName();
        object.demo();// executing demo method...
    }



}
