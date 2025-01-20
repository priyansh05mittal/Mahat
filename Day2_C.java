import java.util.Scanner;

public class Day2_C {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        byte age;
        System.out.print("Enter your age: ");
        age = obj.nextByte();

        System.out.println("You are "+ age +" years old.");
    }
}
