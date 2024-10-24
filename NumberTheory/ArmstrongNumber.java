class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int org_num = num;
        int sum = 0;

        int len = 0;

        while (num > 0) {
            num /= 10;
            len++;
        }

        num = org_num;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, len);
            num /= 10;
        }

        if (sum == org_num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}