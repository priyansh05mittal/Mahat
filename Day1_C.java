import java.util.Scanner;

public class Day1_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Average of your numbers are: "+ (num1 + num2)/2);
    }
}