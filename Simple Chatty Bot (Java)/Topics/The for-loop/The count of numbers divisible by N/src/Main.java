import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberN = scanner.nextInt();
        int sum = (numberB / numberN - (numberA - 1) / numberN);
        System.out.println(sum);
    }
}

