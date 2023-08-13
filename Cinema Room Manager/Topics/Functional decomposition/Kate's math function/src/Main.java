import java.util.Locale;
import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (0 < x && x < 1) {
            return f2(x);
        } else {
            return f3(x);
        }
    }

    //implement your methods here
    public static double f1(double x) {
        if (x <= 0) {
            return Math.pow(x,2) + 1;
        } else {
            return 0;
        }
    }
        public static double f2(double x) {
            if (0 < x && x < 1) {
                return 1 / Math.pow(x,2);
            } else {
                return 0;
            }
        }
            public static double f3(double x){
                if (x >= 1) {
                    return Math.pow(x,2) - 1;
                } else {
                    return 0;
                }
            }
        }