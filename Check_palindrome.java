//Java Program to Check Palindrome

import java.util.*;

public class Check_palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
        
    }     
}
