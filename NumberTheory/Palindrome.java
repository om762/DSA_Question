class Palindrome {
    public static void main(String[] args) {
        int num = 824428;
        int org_num = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (reverse == org_num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}