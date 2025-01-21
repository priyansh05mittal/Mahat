import java.util.Scanner;

public class Day3_C {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        byte num;

        System.out.print("Enter a number between 1 to 5: ");
        num = obj.nextByte();

        switch(num){
            case 1:
                System.out.println("Spring");
                break;

            case 2:
                System.out.println("Summer");
                break;

            case 3:
                System.out.println("Fail");
                break;

            case 4:
                System.out.println("Winter");
                break;

            case 5:
                System.out.println("Invalid Input");
                break;
        }
    }
}
