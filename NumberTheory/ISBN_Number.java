/*
The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book. The ISBN number is a legal number when 1Digit1 + 2Digit2 + 3Digit3 + 4Digit4 + 5Digit5 + 6Digit6 + 7Digit7 + 8Digit8 + 9Digit9 + 10Digit10 is divisible by 11. The digits are taken from right to left. So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
*/

public class ISBN_Number {
    public static void main(String[] args) {
        long num = 1259060977L;

        int digitSum = 0;
        int place = 0;

        while (num > 0) {
            int digit = (int) num % 10;
            digitSum += digit * ++place;

            num /= 10;
        }
        System.out.println(place);
        if (digitSum % 11 == 0 && place == 10)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
