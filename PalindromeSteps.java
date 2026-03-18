import java.util.Scanner;

public class PalindromeSteps {

    // Reverse function
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // Palindrome check
    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (!isPalindrome(num)) {
            int rev = reverse(num);
            int sum = num + rev;

            // Print each step like in problem example
            System.out.println(num + " + " + rev + " = " + sum);

            num = sum;
        }

        System.out.println("Palindrome: " + num);
    }
}