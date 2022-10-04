import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int x = num1.nextInt();
        int y = num2.nextInt();

        int Temp = 0;
        int GCD = 0;

        while(y != 0)
        {
            Temp = y;
            y = x % y;
            x = Temp;
        }

        GCD = x;
        System.out.printf("GCD of n1 and n2 is: " +GCD);
    }
}


