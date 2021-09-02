package abstraction;

public class Child extends AbstractDemo {


    @Override
    public void demo() {

        System.out.println("Method is overridden ");
    }

    public static void main(String[] args) {
        Child obj= new Child();
        obj.demo();
        obj.m1();
    }
}
