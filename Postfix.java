import java.util.Scanner;
import java.util.Stack;

public class Postfix {
     public static int evaluateRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {

                int secondOperand = stack.pop();
                int firstOperand = stack.pop();

                int result = 0;

                switch (token) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        result = firstOperand / secondOperand;
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int size = inputScanner.nextInt();
        String[] tokens = new String[size];

        for (int i = 0; i < size; i++) {
            tokens[i] = inputScanner.next();
        }

        int result = evaluateRPN(tokens);

        System.out.println(result);

        inputScanner.close();
    }
    
    
}
