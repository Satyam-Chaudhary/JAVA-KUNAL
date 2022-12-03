import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
           Syntax of if statements
           if (booolean experession T or F){
           //body
           }else{
           //do this
           }
         */
        System.out.println("enter salary");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
//        if (salary > 10000){
//            salary = salary + 2000;
//        }
//        else{
//            salary = salary + 1000;
//        }
        // multiple if else

        if (salary > 2000) {
            salary += 5000; //salary = salary + 2000;
        }else if (salary > 1000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }

}