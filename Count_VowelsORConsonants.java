//Java Program to Count the Number of Vowels and Consonants in a Sentence

import java.util.Scanner;

public class Count_VowelsORConsonants {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        String str = sc.nextLine();

        int v = 0, c = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) v++;
                else c++;
            }
        }

        System.out.println("Vowels=" + v + " Consonants=" + c);
            }
    
}
