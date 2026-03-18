import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] array) {

        int length = array.length;
        int[] result = new int[length];

        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(array[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int size = inputScanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = inputScanner.nextInt();
        }

        int[] result = nextGreaterElement(array);

        for (int value : result) {
            System.out.print(value + " ");
        }

        inputScanner.close();
    }
}

