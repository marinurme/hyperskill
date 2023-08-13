import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int twoDigit = scanner.nextInt();
        int firstDigit = twoDigit/10;
        System.out.println(firstDigit);

    }
}