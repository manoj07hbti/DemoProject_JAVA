package inheritance;

public class MethodOverLoading {

    // same method name with different different parameters in same class

   // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void m1(){

        System.out.println("This is m1 method wihtout params");
    }
    // method overloading 1

    public void m1(int a){
        System.out.println("This is m1 method with one param int");
    }
    //2
    public void m1(String s){
        System.out.println("This is m1 method with one param String ");
    }
    //3
    public void m1(int a,String s){
        System.out.println("This is m1 method with two param string n int");
    }

    public static void main(String[] args) {
        MethodOverLoading obj= new MethodOverLoading();

        obj.m1();
        obj.m1(33);
        obj.m1("Java");
        obj.m1(33,"Java");
    }

}
