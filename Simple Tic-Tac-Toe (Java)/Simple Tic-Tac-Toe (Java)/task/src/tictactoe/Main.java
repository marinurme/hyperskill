package tictactoe;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int row;
    private static int col;

    public static void main(String[] args) {

        String input = "_________";
        printGameGrid(input);

        char currentPlayer = 'X';
        boolean isGameFinished = false;

        while (!isGameFinished) {
            int userCoordinate;
            int userCoordinate1;

            while (true) {
                try {
                    userCoordinate = scanner.nextInt();
                    userCoordinate1 = scanner.nextInt();
                    scanner.nextLine();
                } catch (java.util.InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("You should enter numbers");
                    continue;
                }

                if (userCoordinate1 < 1 || userCoordinate > 3 || userCoordinate1 < 1 || userCoordinate1 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    break;
                }
            }

            row = userCoordinate - 1;
            col = userCoordinate1 - 1;

            if (input.charAt(row * 3 + col) != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            input = makeYourMove(input, userCoordinate, userCoordinate1, currentPlayer);
            printGameGrid(input);

           if (whoIsWinning(input, currentPlayer)) {
                System.out.println(currentPlayer + " wins");
                isGameFinished = true;
            } else if (isGameGridFull(input)) {
                System.out.println("Draw");
                isGameFinished = true;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O': 'X';
        }
    }


    public static void printGameGrid(String input) {
        System.out.println("---------");
        char[][] gameGrid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char cellValue = input.charAt(i * 3 + j);
                    System.out.print(cellValue + " ");
                }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static String makeYourMove(String input, int row, int col, char player) {
        row--;
        col--;
        char[] charArray = input.toCharArray();
        charArray[row * 3 + col] = player;
        return new String(charArray);
    }

    public static boolean isGameGridFull(String input) {
        return !input.contains("_");
    }


    public static boolean whoIsWinning(String input, char player) {
        return input.charAt(0) == player && input.charAt(1) == player && input.charAt(2) == player ||
                input.charAt(3) == player && input.charAt(4) == player && input.charAt(5) == player ||
                input.charAt(6) == player && input.charAt(7) == player && input.charAt(8) == player ||
                input.charAt(0) == player && input.charAt(3) == player && input.charAt(6) == player ||
                input.charAt(1) == player && input.charAt(4) == player && input.charAt(7) == player ||
                input.charAt(2) == player && input.charAt(5) == player && input.charAt(8) == player ||
                input.charAt(0) == player && input.charAt(4) == player && input.charAt(8) == player ||
                input.charAt(2) == player && input.charAt(4) == player && input.charAt(6) == player;
    }
}

