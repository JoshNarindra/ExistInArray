/*
23/11/22 - NOVUS FS SOFTWARE DEVELOPER PROGRAMME
Exercise 2:
Create programme called ExistInArray.
Create, Initialise, Pre-fill array with values of choosing.
Ask User to enter an integer value to search for in array.
If Value exists, output "Found in Array" - vice versa
 */


//Import necessary libraries
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput;
        int[] initialArray = {1,4,6,98,34,2,5,3,7,4,5,34,6,75,867,7,8,9,};
        boolean check = false;

        Scanner myObj = new Scanner(System.in);

        do {
            System.out.println("Please enter an integer value to search for in the array");
            userInput = myObj.nextLine();
        } while (userInput.isEmpty());

        for (int j : initialArray) {
            if (j == Integer.parseInt(userInput)) {
                check = true;
            }
        }

        if(check){
            System.out.println("Value " + userInput + " found in array.");
        }
        else{
            System.out.println("Value " + userInput + " not found in array.");
        }
    }
}