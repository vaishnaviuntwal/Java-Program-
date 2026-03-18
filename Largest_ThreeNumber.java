// java program to find the largest Among three Number

import java.util.*;

public class Largest_ThreeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first number");
        int num1 = sc.nextInt();

        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        System.out.println("enter the Third number");
        int num3 = sc.nextInt();

        if(num1>num2){
            if(num1>num3){
            System.out.println("largest is " + num1);
            }
            else{
                System.out.println("largest is " + num3);
            }
        }
        else if(num2>num3){
            if(num2>num1){
            System.out.println("largest is " + num2);
            }
            else{
                System.out.println("largest is " + num1);
            }
        }
        else{
            if(num3>num2){
            System.out.println("largest is " + num3);
            }
            else{
                System.out.println("largest is " + num2);
            }
        }

        /*****************************************
                          OR
         *****************************************/
       
       /*   int largest = Math.max(num1,Math.max(num2,num3));

            System.out.println(+largest);
        */

            sc.close();
    }
}
