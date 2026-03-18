//Java Program to Check Whether a Number is Prime or Not

import java.util.*;

public class Check_Number_PrimeORNot {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        SystemSystem.out.println("enter number");
        int n = sc.nextInt();
        
        boolean prime = true;

        if (n <= 1) prime = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }
    
}
