/**
 *
 * Paolo T. Inocencion
 * Coding Challenge #4
 * Using the Java language, create a method SecondGreatLow(arr)
 * that takes the array of numbers stored in arr and return
 * the second lowest and second greatest numbers,
 * respectively, separated by a space…
 */


package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner class that will take in user inputs
        Scanner sc = new Scanner(System.in);

        // User prompts
        System.out.print("How many numbers? ");

        try {

            // initialize array based on user input

            int arrSize = sc.nextInt();
            if (arrSize < 1) {
                throw new IllegalArgumentException("Array size cannot be negative.");
            }

            int[] arr = new int[arrSize];

            System.out.println("Enter numbers: ");

            // loop to populate array with user input
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // create number class
            Number number = new Number();

            System.out.print("OUTPUT: ");

            // call secondGreatLow method
            number.secondGreatLow(arr);

            //Catch exceptions = no negatives, no non-integers
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Enter numbers only please.");
        }


    }

}
