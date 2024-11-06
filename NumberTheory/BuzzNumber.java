/*

Buzz Number: Number that ends with digit 7 or divisible by 7.

*/

class BuzzNumber {
    public static void main(String[] args) {
        int num = 107;

        if (num % 7 == 0 || num % 10 == 7)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
