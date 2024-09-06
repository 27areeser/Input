/*
Name: Andrew Reeser
Date: 9/6/2024
Description: This program will take in two integers given from the user and
will complete the following operations: addition, subtraction, multiplication, division
and find the remainder. After completing these calculations, it will return the answer to the user.
*/

// importing scanner
import java.util.Scanner;

public class Input
{
    public static void main (String [] args)
    {
        // Introduction to the user
        System.out.println("Hello! This program will take in two integers");
        System.out.println("and complete the following operations: addition, ");
        System.out.println("subtraction, multiplication, division, and remainder.");

        // First user input
        System.out.println("Please type in your first integer here: ");
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        
        // Second user input
        System.out.println();
        System.out.println("Please type in your second integer here:");
        Scanner scc = new Scanner(System.in);
        int myInt2 = scc.nextInt();

        // Equations
        int addition = myInt + myInt2;
        int subtraction = myInt - myInt2;
        int multiplication = myInt * myInt2;
        int division = myInt / myInt2;
        int remainder = myInt % myInt2;

        // Printed equations to the user are listed below
        System.out.println();
        System.out.println("When adding your two integers, the answer is: " + addition);
        System.out.println("When subtracting your two integers, the answer is: " + subtraction);
        System.out.println("When multiplying your two integers, the answer is: " + multiplication);
        System.out.println("When dividing your two integers, the answer is: " + division);
        System.out.println("When finding the remainder of your two integers, the answer is: " + remainder);
    










    }




}