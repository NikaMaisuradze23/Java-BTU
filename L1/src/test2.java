import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int x = num1.nextInt();
        int y = num2.nextInt();

        int res1 = x / y;
        int res2 = y % x;

        System.out.println(res1);
        System.out.println(res2);
    }
}
