class printDigits {
    public static void main(String[] args) {
        int num = 824762;

        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
        }
    }
}