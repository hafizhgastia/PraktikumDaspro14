package Pertemuan12;
import java.util.Arrays;

public class ArrayBilangan14 {
    public static void main(String[] args) {

        int[] bil = {14, 22, -1, 34};
        // bil[0] = 14;
        // bil[1] = 22;
        // bil[2] = -1;
        // bil[3] = 34;
        
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
