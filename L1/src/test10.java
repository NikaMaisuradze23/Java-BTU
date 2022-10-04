import java.util.Arrays;
import java.util.Collections;

public class test10 {
    public static void main(String[] args) {
        Integer[] aray = {11, 23, 8, 7, 2, 1, 10, 50};

        Arrays.sort(aray);
        for (int num : aray) {
            System.out.print(num + " ");
        }


    }
}