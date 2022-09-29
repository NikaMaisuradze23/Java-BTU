import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        int x = num1.nextInt();
        int dig1 = 0;
        int sum = 0;

        while(x > 0) {
            dig1 = x % 10;
            sum = sum + dig1;
            x = x / 10;
        }
        System.out.println("Sum of Digits: " + sum);

    }
}