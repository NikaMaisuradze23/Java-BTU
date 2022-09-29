import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        int x = num1.nextInt();

        int dig1 = x / 100;
        int dig2 = (x % 100)/10;
        int dig3 = x % 10;

        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);

    }
}