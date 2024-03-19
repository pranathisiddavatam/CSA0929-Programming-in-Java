import java.util.Scanner;
class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input number: ");
        int number = scanner.nextInt();

        int reverse = reverseNumber(number);
        int sum = number + reverse;

        while (!isPalindrome(sum)) {
            reverse = reverseNumber(sum);
            sum += reverse;
        }

        System.out.println("Palindrome obtained: " + sum);

        scanner.close();
    }

    // Method to reverse a number
    private static int reverseNumber(int num) {
        int reversedNumber = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return reversedNumber;
    }

    // Method to check if a number is palindrome
    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
