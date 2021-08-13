package loops_working;

public class LoopsDemo {


    public static void main(String[] args) {

        // SYNTAX :   for ( variable declaration ; condition ; increment/decrement ){ code }

        // increment loop
        for (int i=0; i<10; i++ ){
            System.out.println("Hello " +i);

        }

        // decrement loop
        for (int i=10; i>0; i-- ){
            System.out.println("Hello " +i);

        }


    // WHILE loop SYNTAX :  while (condition){ CODE }
         int i=0;

        while ( i<10){

            System.out.println(" in side while loop Hello " +i);
            i++;
        }


    }


}
