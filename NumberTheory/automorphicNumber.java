/*

An automorphic number is a natural number whose square ends with the same digits as the number itself

Explanation 
    For example, 5 is an automorphic number because 5^2 = 25, and 25 ends with 5.
Examples
    Other examples of automorphic numbers include 76, because 76^2 = 5,776, and 5,776 ends with 76.

*/

class automorphicNumber{
    public static void main(String[] args) {
        int num = 76;
        int org_num = num;

        int square = num * num;

        int divisor = 1;
        while (num > 0) {
            divisor *= 10;
            num = num / 10;
        }

        int ending_digits = square % divisor;

        if (ending_digits == org_num)
            System.out.println(true);
        else
            System.out.println(false);

    }
}

