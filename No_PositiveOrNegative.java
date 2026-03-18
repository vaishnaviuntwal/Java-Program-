// Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class No_PositiveOrNegative {
  public static void main(String [] args){

    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the number");
    int num = sc.nextInt();

    if (num > 0){ 
        System.out.println("Positive");
    }
    else if (num < 0){
        System.out.println("Negative");
    }
    else {
        System.out.println("Zero");
    } 
 }
}
