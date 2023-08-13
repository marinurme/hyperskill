import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigit = scanner.nextInt();
        int digit1 = (threeDigit/100);
        int digit2 = (threeDigit - (digit1*100))/10;
        int digit3 = threeDigit - (digit1*100) - (digit2*10);
        System.out.println(digit1+digit2+digit3);
    }
}