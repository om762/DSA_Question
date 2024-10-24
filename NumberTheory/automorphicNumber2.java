class automorphicNumber2 {
    public static void main(String[] args) {
        int num = 76;
        String numString = String.valueOf(num);
        int len = numString.length();
        int divisor = (int) Math.pow(10, len);

        int numSquare = num * num;
        int ending_digits = numSquare % divisor;

        if (ending_digits == num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

