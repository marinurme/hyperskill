import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int [] array = new int [numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the index of the first maximum
        int maxIndex = 0;
        for (int i = 1; i < numberOfElements; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Print the index of the first maximum
        System.out.println(maxIndex);




    }
}