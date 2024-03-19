import java.util.Scanner;

class PrimeNumbersAfterNthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int count = 0;
        int num = 2;
        int nthPrime = 0;

        // Find the nth prime number
        while (count < n) {
            if (isPrime(num)) {
                count++;
                nthPrime = num;
            }
            num++;
        }

        System.out.println(n + "th Prime number is " + nthPrime);

        System.out.print(n + " prime numbers after " + nthPrime + " are: ");

        // Print n prime numbers after the nth prime
        count = 0;
        num = nthPrime + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }

        scanner.close();
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
