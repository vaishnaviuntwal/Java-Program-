//Java Program to Find LCM of two Numbers

import java.util.*;

public class LCM_Two_Number {
   public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();

        int a = firstNumber;
        int b = secondNumber;

        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        int gcd = firstNumber;
        int lcm = (a * b) / gcd;

        System.out.println(lcm);
  

    
    }
}

