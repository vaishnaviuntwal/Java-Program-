//Java Program to Check Armstrong Number

import java.util.Scanner;

public class Check_ArmstrongNo {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n != 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
    
}
