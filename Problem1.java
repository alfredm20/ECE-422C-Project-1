/* Student Name: <Alfred Morales>, Lab Section: <17260> */

package assignment1;

import java.util.Scanner;


public class Problem1{

   public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       int n = Integer.parseInt(input.nextLine());
       String s = input.nextLine();

       int []arr = new int[s.length()];

       for(int i = 0 ; i < s.length(); i++){
           char digits = s.charAt(i); //string to characters
           arr[i] = digits - '0'; // character to int
       }

       int biggest = 0; //keeps track of biggest product


       for(int i = 0; i <= arr.length - n; i++){
           int multiplier = 1;

           for(int j = 0; j < n; j++){

               if(arr[i +j] == 0){
                   multiplier = 0;
                   break;
               }

               multiplier = multiplier * arr[i + j];

               if(multiplier > biggest){
                   biggest = multiplier;
               }

           }



       }

       System.out.println(biggest);

   }

}
