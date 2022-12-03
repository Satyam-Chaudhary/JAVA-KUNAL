import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a,b and c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q-- Find largest of a a,b and c.

        int max = a;
        if (b > max) {
            max = b;
        }
            if (c > max) {
                max = c;
            }
        System.out.println("maximum value is " + max);


    }
}

