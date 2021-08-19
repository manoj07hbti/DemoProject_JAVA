package method;

public class MethodWithInputParams {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}
    // we can pas parameter as a variable : (Datatype variable_name)

    public void message(String name){

        System.out.println(name);
        System.out.println("Hello " +name);
    }

    public void twoParams(String name, int age){

        System.out.println("Age is :"+age +" Name is :"+name);
    }


    public static void main(String[] args) {
        MethodWithInputParams obj= new MethodWithInputParams();

        obj.message("JAVA");
        obj.twoParams("Spring",25);

    }


}
