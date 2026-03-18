// java program to Add two integers
import java.util.Scanner;

public class Add_Two_No {
    public static void main(String[] args) {
     
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a  First Number  ");
        int num1 = obj.nextInt();

         System.out.println("Enter a second Number ");
        int num2 = obj.nextInt();

        System.out.println("Sum of Two numbers:  "+(num1+num2));

        obj.close();
    }
    
}
