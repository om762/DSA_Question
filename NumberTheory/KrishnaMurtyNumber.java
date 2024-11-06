/*
A Krishna Murty number is a number that is equal to the sum of the factorial of all its digits.
*/

class KrishnaMurtyNumber {
    public static void main(String[] args) {
        int num = 145;
        int org_num = num;
        int sumOfDigits = 0;

        while (num > 0) {
            int fact = factorial(num % 10);
            sumOfDigits += fact;
            num /= 10;
        }

        if (org_num == sumOfDigits)
            System.out.println(true);
        else
            System.out.println(false);
    }

    // Factorial using recursion
    static int factorial(int num) {
        if (num == 1)
            return 1;
        return factorial(num - 1) * num;
    }
}
