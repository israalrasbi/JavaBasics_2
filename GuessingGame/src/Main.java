import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
        Scanner sc = new Scanner(System.in);

        //define the correct number, it should be random
        Random rand = new Random(); //use the Random library
        int correctNumber = rand.nextInt(101); //the range will be from 0 to 100

        //define a counter to keep track of the number of attempts
        int numOfTry = 0;

        //use a while loop so the user will keep trying until they guess the correct number
        //define a flag to stop the loop
        boolean isWin = false;
        while(isWin == false) {
            //take input from user
            System.out.print("Enter the winning number: ");
            int number = sc.nextInt();
            numOfTry++; //increment each time the user is guessing wrong
            //use if statments to check if the user entered the correct number or not
            if (number == correctNumber) {
                System.out.println("Congratulations! You won!");
                isWin = true; //change the flag to stop the loop
            } else if (number > correctNumber) {
                System.out.println("too high!, try again");
            } else if (number < correctNumber) {
                System.out.println("too low!, try again");
            } else {
                System.out.println("Invalid");
            }
        }
        //print the number of attempts
        System.out.println("You got " + numOfTry + " attempts");


    }
}