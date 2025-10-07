import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    //create variables

    Scanner scanner = new Scanner(System.in);
    int inValue;

    //practice input
    System.out.println("Please enter your next value: ");
    inValue = scanner.nextInt();
    System.out.println("Why did you enter " + inValue + "?");

    //setting up other variable types
    char letter = 'A';
    String words = "The Words";

    //LECTURE 1
    //add code to input a string replacing the variable 
    System.out.println("Enter a string: ");
    scanner.nextLine();
    //words with the input value
    words = scanner.nextLine();
    //print the string
    System.out.println("User Input: " + words);



    //add code to input a new value for the variable
    System.out.println("Enter a letter A - F: ");

    //letter
    letter = scanner.next().charAt(0);
    //LECTURE 2
    //if the letter entered is A or B - print "You did GREAT!"
    if (letter == 'A' || letter == 'B') {
      System.out.println("You did GREAT!");
    }
    //if the letter is C - print "You did GOOD!"
    else if (letter == 'C') {
      System.out.println("You did GOOD!");
    }
    //if the letter is D or F - print "Try again"
    else if (letter == 'D' || letter == 'F') {
      System.out.println("Try Again");
    }
    //if the letter is something else, print "Incorrect value"
    else {
      System.out.println("Incorrect Value");
    }

    //LECTURE 1
    //this is demonstrating different values
    System.out.println("\u03B1" + "   " + 0b1111);
    

    //LECTURE 1
    //formatting values for output
    double value = 16.404674;
    System.out.printf("Value is $%4.2f", value);

    scanner.close();
  }

}
