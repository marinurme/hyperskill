import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long[] longNumbers = { 100_000_000_001L, 100_000_000_002L, 100_000_000_003L };

        System.out.println(Arrays.toString(longNumbers));

        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]];
    }
}