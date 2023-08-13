import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayElementsNum = scanner.nextInt();
        int dividesBySix = 1;
        int sum = 0;
        for (int i = 0; i < arrayElementsNum; i++) {
            int scannedNumber = scanner.nextInt();
            dividesBySix = scannedNumber % 6;
            if (dividesBySix == 0) {
                sum = sum + scannedNumber;
            }
        }
        System.out.println(sum);
    }
}