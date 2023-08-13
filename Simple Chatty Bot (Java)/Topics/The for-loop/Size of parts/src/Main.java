import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < numberOfParts; i++) {
            int scannedNumber = scanner.nextInt();
            if (scannedNumber == 1) {
                larger = larger + 1;
            } else if (scannedNumber == -1) {
                smaller = smaller + 1;
            } else {
                perfect = perfect + 1;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}