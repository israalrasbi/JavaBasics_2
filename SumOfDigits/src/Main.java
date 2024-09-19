import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter number to calculate the sum of digits: ");
        //take the input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0; //define a variable that will keep the sum of the given number
        //keep looping as long and the number is not zero
        while (number != 0) {
            //using modulus, get the last digit of the given number
            //add this digit to the sum
            sum = sum + number % 10;
            //remove the last digit from the number
            number = number / 10;
        }
        System.out.println("The sum: "+sum);
    }
}