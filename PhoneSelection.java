/*
Anita Umana
CMSC 255 Section 901
*/

import java.util.Scanner;

public class PhoneSelection {
	public static void main(String[] args) {
// Have to declare the scanner
      Scanner scnr = new Scanner(System.in);

    // prompt the user to enter a number
    System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone.");

    //These next 2 lines will read the user's input and store it in the variable letter along with making sure it is upper case
    char usercharacter = scnr.next().charAt(0);
    usercharacter = Character.toUpperCase(usercharacter);
    
    // have the algorithm  output number based on the selected letter. Also add a default case for if the user does not enter a letter.
    switch (usercharacter) {
      case 'A':
      case 'B':
      case 'C':
        System.out.println("The digit 2 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'D':
      case 'E':
      case 'F':
        System.out.println("The digit 3 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'G':
      case 'H':
      case 'I':
        System.out.println("The digit 4 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'J':
      case 'K':
      case 'L':
        System.out.println("The digit 5 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'M':
      case 'N':
      case 'O':
        System.out.println("The digit 6 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
        System.out.println("The digit 7 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'T':
      case 'U':
      case 'V':
        System.out.println("The digit 8 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
        System.out.println("The digit 9 corresponds to the letter " + usercharacter + " on the telephone.");
        break;
      default:
        System.out.println("There is no matching digit for the character " + usercharacter + " entered.");
        break;
    }
  
  }
}