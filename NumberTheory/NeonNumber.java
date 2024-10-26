public class NeonNumber {
    public static void main(String[] args) {
        int num = 45;

        int numSquare = (int) Math.pow(num, 2);

        int sumOfDigits = 0;

        while (numSquare > 0) {
            sumOfDigits += numSquare % 10;
            numSquare /= 10;
        }

        if (num == sumOfDigits) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
