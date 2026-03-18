//Java Program to Make a Simple Calculator Using switch...case

import java.util.Scanner;

public class Calculator_usingSwitch {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Operator");
        char op = sc.next().charAt(0);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter number");
        int b = sc.nextInt();

        switch(op) {
            case '+': System.out.println("Answer = "+(a + b)); break;
            case '-': System.out.println("Answer = "+(a - b)); break;
            case '*': System.out.println("Answer = "+(a * b)); break;
            case '/': System.out.println("Answer = "+(a / b)); break;
            default: System.out.println("Invalid");
        }
    }
    
}
