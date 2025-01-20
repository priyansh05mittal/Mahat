import java.util.Scanner;

public class Day2_B {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num1, num2;
        System.out.print("Enter number 1: ");
        num1 = obj.nextInt();
        System.out.print("Enter number 2: ");
        num2 = obj.nextInt();
        
        System.out.println("Sum of your numbers: "+ (num1 + num2));
        System.out.println("Difference of your numbers: "+ (num1 - num2));
        System.out.println("Product  of your numbers: "+ (num1*num2));
        System.out.println("Quotient of your numbers: "+ (num1/num2));
    }
}
