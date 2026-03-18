//Java Program to Calculate the Power of a Number

import java.util.Scanner;

public class Power_Number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter base");
        int base = sc.nextInt();
        System.out.println("enter EXp");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
            
        System.out.println(result);
    }
    
}
