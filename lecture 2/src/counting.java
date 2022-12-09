import java.util.Scanner;

public class counting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        long n = in.nextLong();
        System.out.println("enter number to count");
        int num = in.nextInt();
        int count = 0;
        while (n > 0){
            long rem = n % 10;
            if (rem == num) {
                count++;
            }
            n /= 10; //n = n / 10
        }
        System.out.println(count);
    }
}

