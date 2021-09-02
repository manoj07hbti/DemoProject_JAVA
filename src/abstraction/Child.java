package abstraction;

public class Child extends AbstractDemo {


    @Override
    public void demo() {

        System.out.println("Method is overridden ");
    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        Child obj= new Child();
        obj.demo();
        obj.m1();
    }
}
