// Java program to check Whether an Alphabet is vowel or Consonant
import java.util.Scanner;

public class Check_VowelOrConsonant {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Alphabet :");
        char ch = sc.next().toLowerCase().charAt(0);

        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='e'){
                System.out.println("Alphabet is Vowel");
            }
            else{
                System.out.println("Alphabet is Consonant");
            }
        }
        
        else{
            System.out.println("It is not an Alphabet");
        }
    
        sc.close();

    }
    
}
