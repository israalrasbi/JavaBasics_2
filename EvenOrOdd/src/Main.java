import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is this Even or Odd? ");
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }

    }
}