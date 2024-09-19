import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        //the idea of Fibonacci is to add the two previous numbers to get the next element
        //the start is 0 and 1, so define variable num1 and num2
        int num1 = 0;
        int num2 = 1;
        //use for loop to continuously add the two previous numbers to get the next number until we reach n
        for(int i = 0; i < n; i++) {
            //print the elements
            System.out.print(num1 + ",");
            //define num3 that will contain the result of the next number
            int num3 = num2 + num1;
            //swap
            num1 = num2; //swap the first num with the second
            num2 = num3; //swap the second with the third
        }

    }
}