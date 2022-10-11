import java.util.Scanner;
public class test2 {
    static void method1() {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);

        int a = num1.nextInt();
        int b = num2.nextInt();
        int c = num3.nextInt();
        int resMax = Math.max(a, b);
        int resMin = Math.min(a, b);

        if(resMax > c) {
            System.out.println("max: " +resMax);
        } else {
            System.out.println("max: " +c);
        }

        if(resMin > c) {
            System.out.println("min: " + c);
        } else {
            System.out.println("min: " + resMin);
        }

    }

    public static void main(String[] args) {
        method1();

    }
}
