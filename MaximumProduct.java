import java.util.*;

public class MaximumProduct {
    
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int size = inputScanner.nextInt();
        int[] efficiencies = new int[size];

        for (int i = 0; i < size; i++) {
            efficiencies[i] = inputScanner.nextInt();
        }

        Arrays.sort(efficiencies);

        int product1 = efficiencies[size - 1] * efficiencies[size - 2] * efficiencies[size - 3];
        int product2 = efficiencies[0] * efficiencies[1] * efficiencies[size - 1];

        int maximumProduct = Math.max(product1, product2);

        System.out.println(maximumProduct);

        inputScanner.close();
    }
}
