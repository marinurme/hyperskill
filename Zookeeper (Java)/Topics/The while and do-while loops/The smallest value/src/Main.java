import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 0;
        long nFactorial = 1;
        while (nFactorial <= m) {
            n++;
            nFactorial *= n;

        }
        System.out.println(n);
    }
}
