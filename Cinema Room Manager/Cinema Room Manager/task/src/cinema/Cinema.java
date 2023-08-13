package cinema;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cinema {
    private static char[][] floorPlan;
    private static int rows;
    private static int seats;
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isRunning = true;
    private static int numberOfSoldTickets = 0;
    private static int currentIncome = 0;
    private static int totalIncome = 0;


    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();

        if ((rows*seats) > 60){
            totalIncome = ((((rows*seats)/2) * 8) + (((rows*seats)/2)* 10));
        }else{
            totalIncome = (rows*seats) * 10;
        }

        seating();

        while (isRunning) {
            System.out.println();
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");
            int menu = scanner.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    showTheSeats();
                    break;
                case 2:
                    buyATicket();
                    break;
                case 3:
                    Statistics();
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }

    public static void seating() {
        System.out.println(" Cinema:");

        floorPlan = new char[rows + 1][seats + 1];

        // Fill the cinema array with 'S'
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= seats; j++) {
                floorPlan[i][j] = 'S';
            }
        }
        // Print the cinema array with row and column headers
        System.out.print("  ");
        for (int j = 1; j <= seats; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= seats; j++) {
                System.out.print(floorPlan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void buyATicket() {
        while (true) {
            System.out.println("Enter a row number:");
            int desiredRow = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            int desiredSeat = scanner.nextInt();

            int totalNumberOfSeats = rows * seats;
            int total = 0;

            if (desiredRow >= 1 && desiredRow <= rows && desiredSeat >= 1 && desiredSeat <= seats) {
                if (floorPlan[desiredRow][desiredSeat] == 'B') {
                    System.out.println("That ticket has already been purchased!");
                    System.out.println();
                } else {

                    if (totalNumberOfSeats < 60 || desiredRow < 5) {
                        total = 10;
                    } else {
                        total = 8;
                    }
                    System.out.println("Ticket price: $" + total);
                    floorPlan[desiredRow][desiredSeat] = 'B';
                    numberOfSoldTickets++;
                    currentIncome = currentIncome + total;
                    break;
                }

            } else {
                System.out.println("Wrong input!");
                System.out.println();
            }
        }
    }

        public static void showTheSeats() {
            System.out.println(" Cinema:");

            // Print the updated cinema array with the desired seat marked as 'B'
            System.out.print("  ");
            for (int j = 1; j <= seats; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            for (int i = 1; i <= rows; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= seats; j++) {
                    System.out.print(floorPlan[i][j] + " ");
                }
                System.out.println();
            }
        }
    public static float calculatePercentage() {
        int totalNumberOfSeats = rows * seats;
        return ((float) numberOfSoldTickets / (float) totalNumberOfSeats) * 100;
    }

        public static void Statistics() {
            System.out.println("Number of purchased tickets: " + numberOfSoldTickets);
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            float percentage = calculatePercentage();
            String formattedPercentage = decimalFormat.format(percentage);
            System.out.println("Percentage: " + formattedPercentage + "%");
            System.out.println("Current income: " + "$" + currentIncome);
            System.out.println("Total income: " + "$" + totalIncome);
        }
    }




