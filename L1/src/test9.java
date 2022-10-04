import java.util.Arrays;
import java.util.Collections;

public class test9 {
    public static void main(String[] args) {
        Integer[] aray = {1, 2, 3, 4, 5, 6, 7, 8};

        int min = Collections.min(Arrays.asList(aray));
        int max = Collections.max(Arrays.asList(aray));

        System.out.println("max: " + max);
        System.out.println("min: " + min);


    }
}