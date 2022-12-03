import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q- print numbers from 1 to 5.
        // System.out.println("1\n2\n3\n4\n5");
        //or use loops

        //FOR LOOP
//        SYNTAX for FOR LOOPS
        /*
        for (initialisation ; conditon ;increment){
        body
        }
         */

        //Q- print numbers from 1 to 5.

//        for (int num = 1; num <= 5; num++/*num= num+1 or num+=1*/) {
//            System.out.println(num);


        //WHILE LOOP
        /*
            SYNTAX
            initialisation
            while (condition) {
                //body
                increment
            }
        */

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num++;
        }
    }
}
