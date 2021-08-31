package inheritance;

public class B {

    public void m1(){

        System.out.println("I am in M1 of class B...");
    }

    public void m2(){

        System.out.println("I am in M2 of class B...");
    }

    public static void main(String[] args) {
        B obj= new B();
        obj.m1();
    }

}
