import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTheShape = scanner.nextInt();
        String chosen = "You have chosen a";

        switch (numberOfTheShape) {
            case 1:
                System.out.println(chosen + " square");
                break;
            case 2:
                System.out.println(chosen + " circle");
                break;
            case 3:
                System.out.println(chosen + " triangle");
                break;
            case 4:
                System.out.println(chosen + " rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}