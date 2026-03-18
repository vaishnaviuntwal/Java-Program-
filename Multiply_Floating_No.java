import java.util.Scanner;

public class Multiply_Floating_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the  first number");
        float num1 = sc.nextFloat();

        System.out.println("enter the second number ");    
        float num2 = sc.nextFloat();

        float result = num1 * num2;

        System.out.println("Multiplication = " + result);

    }
}
