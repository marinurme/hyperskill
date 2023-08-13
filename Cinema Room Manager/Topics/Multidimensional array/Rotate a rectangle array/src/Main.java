import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //input array
        int[][] inputArray = new int[n][m];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] ;
            }
        }

        //Array that is rotated by 90 degrees
        int[][] rotatedArray = new int[m][n];
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                rotatedArray[i][j] = inputArray[n - j - 1][i];
                        System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
