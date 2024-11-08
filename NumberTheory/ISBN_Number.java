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
