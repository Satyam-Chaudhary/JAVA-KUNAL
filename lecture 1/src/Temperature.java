import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celsius-");
        float tempC = input.nextFloat();
        float tempF = (tempC*9/5) + 32;
        System.out.println("Temperature in farenhiet is :\n" + tempF);
    }
}


