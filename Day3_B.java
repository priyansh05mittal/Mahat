public class Day3_B {
    public static void main(String[] args) {
        byte a=5, b=10, c=15;
        if((a>b) && (a>c))
            System.out.println("Largest number is: "+ a);
        if((b>a) && (b>c))
            System.out.println("Largest number is: "+ b);
        if((c>a) && (c>b))
            System.out.println("Largest number is: "+ c);
    }
}
