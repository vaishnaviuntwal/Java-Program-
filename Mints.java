import java.util.Scanner;

public class Mints {
    
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int firstKidMints = inputScanner.nextInt();
        int queueLength = inputScanner.nextInt();

        int totalMints = firstKidMints;
        int currentKidMints = firstKidMints;

        for (int i = 2; i <= queueLength; i++) {
            currentKidMints = totalMints - 1;
            totalMints = totalMints + currentKidMints;
        }

        System.out.println(totalMints);

        inputScanner.close();
    }
    
}
