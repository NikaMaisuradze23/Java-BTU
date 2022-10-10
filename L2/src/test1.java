import java.util.Scanner;


public class test1 {
    static void myMethod() {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        String a = num1.nextLine();
        String b = num2.nextLine();
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
    }

    public static void main(String[] args) {
        myMethod();
    }
}