import java.util.Scanner;

class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the given number: ");
        int number = scanner.nextInt();

        int factorsCount = 0;

        System.out.print("Number of factors = ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsCount++;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nTotal factors = " + factorsCount);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int factor = 0;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    factor = i;
                    break;
                }
            }
        }

        System.out.println("The " + n + "th factor of " + number + " = " + factor);

        scanner.close();
    }
}
