import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        if (n==0){
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}