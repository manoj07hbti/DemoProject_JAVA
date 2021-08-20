package method;

public class MethodWithReturnType {

    public String demo(){
     String name="Core Java";
     return name;
    }

    public int demoInt(){

        return 33;
    }


    public String message(String msg){
        String output="Hello "+msg;
        return output;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj=new MethodWithReturnType();
       String var= obj.demo();// storing output in to var variable
       System.out.println(var);

       String result=obj.message("John");
       System.out.println(result);

       int result_int=obj.demoInt();
       System.out.println(result_int);
    }
}
