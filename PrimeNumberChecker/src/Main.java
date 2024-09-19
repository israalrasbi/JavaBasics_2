import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the input from the user
        System.out.print("Enter a prime number: ");
        int num = sc.nextInt();
        //define a flag
        boolean isPrime = true;

        //this loop will check if the user entered a prime number or not
        //the i start at 2 because it's the smallest prime number
        //check if i is less than the square root of the number
        for(int i = 2; i<=Math.sqrt(num); i++) {
            //if I can divide the number, then it's not a prime
            //therefore, the flag should be false
            if(num%i == 0) {
                isPrime = false;
            }
        }
        //check the flag, if true then it's prime, otherwise it's not
        if(isPrime == true) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }

    }
}