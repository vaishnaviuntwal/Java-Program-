//Java Program to Find GCD of two Numbers

import java.util.Scanner;

public class GCD_Two_Number {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter number");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD = " + a);
    }    
}
