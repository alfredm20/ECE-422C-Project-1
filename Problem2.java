/* Student Name: <Alfred Morales>, Lab Section: <17260> */


package assignment1;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int j = 0;
        String[] arr = s.split(" ");



        for (int i = 0; i < arr.length - 1; i++) { //check each word
            int total = 0;
            String out = arr[i];

            //check each character like in prob 1
            for(String top : arr){
                char letter = s.charAt(j + i); //string to characters

                //get a character and add the characters up
                if(Character.isAlphabetic(letter)){
                    letter = Character.toLowerCase(letter);
                     total = total + (letter - 96);
                }

                if(letter == ' '){
                    break;
                }

                j++;
            }

            if(total == 100){ //if the characters equal 100 print them out
                System.out.println(arr[i]);
            }

        }
    }
}

