//Java Program to Display Armstrong Number Between Two Intervals

import java.util.Scanner;

public class Check_Armstrong_twoInterval{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("enter number");
        int num1 = sc.nextInt();

         System.err.println("enter number");
        int num2 = sc.nextInt();


        for (int i = num1; i <= num2; i++) {
    int temp = i;
    int sum = 0;

    while (temp != 0) {
        int d = temp % 10;
        sum += d * d * d;
        temp /= 10;
    }

    if (sum == i) System.out.print(i + " ");
}
    }
}