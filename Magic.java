import java.util.Scanner;

public class Magic {
    public static int magic(int x, int n) {

        int result = 0;
        int placeValue = 1;

        while (x > 0) {

            int digit = x % 10;
            int newDigit = (digit + n) % 10;

            result = result + newDigit * placeValue;

            placeValue = placeValue * 10;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int x = inputScanner.nextInt();
        int n = inputScanner.nextInt();

        int result = magic(x, n);

        System.out.println(result);

        inputScanner.close();
    }
    
    
}
