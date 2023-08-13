
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();

        double result1 = ((double) (number4) /2);
        int roundedUp1 = (int) Math.round(result1);

        double result2 = ((double) (number5) /2);
        int roundedUp2 = (int) Math.round(result2);

        double result3= ((double) (number6) /2);
        int roundedUp3 = (int) Math.round(result3);
        int sum = roundedUp1 + roundedUp2 + roundedUp3;
        System.out.println(sum);
    }
}


