/*
Peterson Number: A number is said to be a Peterson number if the sum of factorials of each digit of the number is equal to the number itself.
*/

public class PetersonNumber {
    public static void main(String[] args) {
        int num = 145;
        int org_num = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == org_num)
            System.out.println(true);
        else
            System.out.println(false);
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }
}
