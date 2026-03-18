//Java Program to Check Whether a Character is Alphabet or Not

import java.util.*;

public class Check_AlphabetOrNot {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not Alphabet");
        }
    }    
}
