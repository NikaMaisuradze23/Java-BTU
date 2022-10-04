import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int x = num1.nextInt();
        int y = num2.nextInt();

        for(int i = x; i <= y; i++) {
            System.out.println(i);
        }


    }
}