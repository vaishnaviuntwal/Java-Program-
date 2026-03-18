import java.util.Scanner;

public class Number_To_N_Decimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        int n =sc.nextInt();

        double scale = Math.pow(10,n);
        double result = Math.round(num*scale)/scale;

        System.out.println(result);
    }
    
}
