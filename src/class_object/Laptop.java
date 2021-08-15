package class_object;

public class Laptop {

    //properties
    String brand="Dell";// declaration and initialization
    int ram=8;
    double price=68000.5;
    int hard_drive=512;

    public static void main(String[] args) {
        // SYNTAX for creating object
        // CLASS_NAME  OBJ_NAME= new CLASS_NAME();
        Laptop object = new Laptop();// Object1 created using Default Constructor

        System.out.println(object.brand); // object.property_name
        System.out.println(object.ram);
        System.out.println(object.hard_drive);
        System.out.println(object.price);

        Laptop object1 = new Laptop();// Object2 created

        System.out.println(object1.brand); // object.property_name
        System.out.println(object1.ram);
        System.out.println(object1.hard_drive);
        System.out.println(object1.price);


    }



}
