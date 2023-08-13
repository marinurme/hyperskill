import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerNumber = scanner.nextInt();
        int upperNumber = scanner.nextInt();
        int num = 1;
        for (int i = lowerNumber; i < upperNumber; i++) {
            num = num * i;
       }
        System.out.println(num);

    }
}