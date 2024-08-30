import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter you first name:");
    String name = scanner.nextLine();

    System.out.println("Enter your favourite food: ");
    String food = scanner.nextLine();

    System.out.println("\nFirst Name: " + name + "\nAge: " + name + "\nFavourite Food:" + food);





    }

}
