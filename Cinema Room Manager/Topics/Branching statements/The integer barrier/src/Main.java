import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            sum = sum + number;
            if (number == 0) {
                break;
            }
            if (sum >= 1000){
                sum = sum - 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}