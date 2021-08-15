package class_object;

public class Book {

    //properties

   String name; // declaration
   String writer;
    int pages;

    // Parameterized constructor

    public Book(String name, String writer, int pages) {
        this.name = name;
        this.writer = writer;
        this.pages = pages;
    }

    public static void main(String[] args) {

        Book object1= new Book("Java","James Gosling",1200);

        System.out.println(object1.name);
        System.out.println(object1.writer);
        System.out.println(object1.pages);

        Book object2= new Book("Spring","Kethy",900);

        System.out.println(object2.name);
        System.out.println(object2.writer);
        System.out.println(object2.pages);

        Book object3= new Book("Spring Boot","Siera",1000);

        System.out.println(object3.name);
        System.out.println(object3.writer);
        System.out.println(object3.pages);
    }


}
