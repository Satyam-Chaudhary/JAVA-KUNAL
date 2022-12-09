import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nth fibonacci number:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
//        int count = 2;
//        while (count <= n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }

        for (int count =2 ; count <= n; count++){
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println(b);
        // while loop looks much clearer.
    }
}
