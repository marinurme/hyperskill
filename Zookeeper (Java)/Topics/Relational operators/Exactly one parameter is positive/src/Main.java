import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean isPositive1 = number1 >= 0 && number2 <= 0 && number3 <= 0;
        boolean isPositive2 = number1 <= 0 && number2 >= 0 && number3 <= 0;
        boolean isPositive3 = number1 <= 0 && number2 <= 0 && number3 >= 0;
        boolean oneIsPositive = isPositive1 || isPositive2 || isPositive3;
        System.out.println(oneIsPositive);
    }
}