class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }
}

public class Day4{ 
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum of 10 and 15: "+ obj.add(10, 15));
        System.out.println("Difference between 15 and 10: "+ obj.subtract(15, 10));
        System.out.println("Product of 23 and 8 is: "+ obj.multiply(23,8));
        System.out.println("Division of 80 and 8 is: "+ obj.divide(80, 8));
    } 
}