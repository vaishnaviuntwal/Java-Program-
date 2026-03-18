import java.util.Scanner;

public class Swap_Two_No {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second number");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        
    }
    
}
