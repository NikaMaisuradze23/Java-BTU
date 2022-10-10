import java.util.Scanner;


public class test1 {
    static void method1() {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        String a = num1.nextLine();
        String b = num2.nextLine();
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
    }

    static void method2() {
        System.out.println("დაწერეთ პირველი რიცხვი: ");
        Scanner num1 = new Scanner(System.in);

        System.out.println("დაწერეთ მეორე რიცხვი: ");
        Scanner num2 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num2.nextInt();
        System.out.println(b + a);

    }

    static void method3() {
        System.out.println("დაწერეთ პირველი რიცხვი: ");
        Scanner num1 = new Scanner(System.in);

        System.out.println("დაწერეთ მეორე რიცხვი: ");
        Scanner num2 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num2.nextInt();
        System.out.println(b * a);

    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }
}