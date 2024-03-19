import java.util.Scanner;
class NumberSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[][] numberSquareArray = new int[size][2];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numberSquareArray[i][0] = number;
            numberSquareArray[i][1] = number * number;
        }

        System.out.println("Array with the first element as the number and the second element as the square:");
        for (int i = 0; i < size; i++) {
            System.out.println("[" + numberSquareArray[i][0] + ", " + numberSquareArray[i][1] + "]");
        }

        scanner.close();
    }
}
