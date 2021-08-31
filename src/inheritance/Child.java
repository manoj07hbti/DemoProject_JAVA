package inheritance;

public class Child extends Parent{

    // method overriding
    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void m1(){
        System.out.println("I am in M1 of CHILD class");
        System.out.println("I am in M1 of CHILD class");
    }

    public static void main(String[] args) {

        Child obj = new Child();
        obj.m1();

        Parent object=new Child();
        object.m1();
    }
}
