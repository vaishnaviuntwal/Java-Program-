// java program to check if a String is Empty or Null

import java.util.Scanner;

public class Check_String_IsemptyOrnull {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.next();

        if (str == null || str.length() == 0){
            System.out.println("String is Empty or null");
        }
        else{
            System.out.println("String is Not Empty");
        }

        sc.close();
    }
    
}
