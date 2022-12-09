import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char dalo = in.next().trim().charAt(0);

        if (dalo >= 'a' && dalo <= 'z'){
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }


            }
        }








