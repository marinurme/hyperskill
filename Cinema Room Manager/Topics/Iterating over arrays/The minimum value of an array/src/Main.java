import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        //create the array
        int [] array = new int [numberOfElements];

        //Read the array elements
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the minimum value of the array
        int minValue = array[0];
        for (int i = 1; i < numberOfElements; i++) {
           if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        //Print the value of the minimum value
       System.out.println(minValue);
    }
}