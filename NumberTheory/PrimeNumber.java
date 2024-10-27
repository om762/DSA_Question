class PrimeNumber {
    public static void main(String[] args) {
        int num = 17;
        for (int i = 2; i <= num / 2; i ++) {
            if (num % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
