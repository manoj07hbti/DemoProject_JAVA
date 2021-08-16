package method;

public class Student {

    // properties or data member
    String name;
    int age;
    int rollno;

   // capabilities
    /*read,run,eat, write*/

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void read(){

        System.out.println("This is read method");
    }
    public void run(){

        System.out.println("This is run method of student ");
    }

    public static void main(String[] args) {
        Student obj= new Student();
        obj.read();
        obj.run();
    }

}
