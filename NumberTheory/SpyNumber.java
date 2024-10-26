public class SpyNumber {
    public static void main(String[] args) {
        int num = 22;
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (num > 0) {
            sumOfDigits += num % 10;
            productOfDigits *= num % 10;
            num /= 10;
        }

        if (productOfDigits == sumOfDigits) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
