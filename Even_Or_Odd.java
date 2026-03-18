// java program to check whether a Number is Even or Odd

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number");
        int num = sc. nextInt();

        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        sc.close();
    }
    
}
