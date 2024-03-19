import java.util.ArrayList;
import java.util.Scanner;
class PerfectSquaresWithDigitSumLessThan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the range and check for perfect squares with digit sum less than 10
        for (int i = lowerRange; i <= upperRange; i++) {
            if (isPerfectSquare(i) && digitSum(i) < 10) {
                result.add(i);
            }
        }

        System.out.println(result);

        scanner.close();
    }

    // Function to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to calculate the sum of digits of a number
    private static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
