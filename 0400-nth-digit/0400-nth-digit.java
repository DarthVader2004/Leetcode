public class Solution {
    public static int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        int start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;       // Move to next digit length
            count *= 10;         // Number of digits in this group
            start *= 10;         // Starting number of this digit group
        }

        // Determine the actual number that contains the nth digit
        int number = start + (n - 1) / digitLength;

        // Convert the number to a string and extract the specific digit
        String numberStr = Integer.toString(number);
        return numberStr.charAt((n - 1) % digitLength) - '0';
    }
}
