// java program to compute Quotient and Remainder
import java.util.Scanner;
public class Compute_QuoandRem {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Quotient = "+(num1 / num2));
        System.out.println("Remainder = "+(num1 % num2));

        sc.close();
    }
    
}
