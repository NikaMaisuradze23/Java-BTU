import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        int x = num1.nextInt();
        int y = num2.nextInt();
        int k = num3.nextInt();

        int res1 = x + y + k;
        int res2 = x * y * k;

        System.out.println(res1);
        System.out.println(res2);
    }
}