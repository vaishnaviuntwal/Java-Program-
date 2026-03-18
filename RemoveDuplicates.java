import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicates(String inputString) {

        Stack<Character> characterStack = new Stack<>();

        for (char currentCharacter : inputString.toCharArray()) {

            if (!characterStack.isEmpty() && characterStack.peek() == currentCharacter) {
                characterStack.pop();
            } else {
                characterStack.push(currentCharacter);
            }
        }

        StringBuilder resultString = new StringBuilder();

        for (char character : characterStack) {
            resultString.append(character);
        }

        return resultString.toString();
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        String inputString = inputScanner.nextLine();

        String result = removeDuplicates(inputString);

        System.out.println(result);

        inputScanner.close();
    }
    
    
}
