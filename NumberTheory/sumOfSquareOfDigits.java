class SumOfSquareOfDigits {
    public static void main(String[] args) {
        int num = 824762;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 2);
            num = num / 10;
        }
        System.out.println(sum);
    }
}    
