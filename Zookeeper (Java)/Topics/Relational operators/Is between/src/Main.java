import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
boolean inRange = number1 <= number2 && number1 >= number3;
boolean inRange1 = number1 <= number3 && number1 >= number2;
boolean inRange2 = inRange || inRange1;
        System.out.println(inRange2);

    }
}