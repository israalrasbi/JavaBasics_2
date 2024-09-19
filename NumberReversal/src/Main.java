import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //take the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        //define two variable
        int reverseNumber = 0; //this will store the reverse number
        int lastNumber; //this will store the last digit

       //keep looping until we process all the digits
       while(number>0) {
            lastNumber = number%10; //this should take the last digit
            //first multiply by 10, to shift the numbers to the left, this will provide a space to the new number
            //add the lastNumber to the empty space
           reverseNumber = reverseNumber*10+lastNumber;
           //remove the last digit from the number
           number = number/10;
        }
        System.out.println("The reverse number is: "+reverseNumber);
    }
}