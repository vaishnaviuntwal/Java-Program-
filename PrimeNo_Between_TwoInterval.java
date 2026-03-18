//Java Program to Display Prime Numbers Between Two intervals

import java.util.Scanner;

public class PrimeNo_Between_TwoInterval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number ");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            boolean prime = true;

            if (i <= 1) prime = false;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) System.out.print(" prime number ="+ i);
        }
    }
    
}
