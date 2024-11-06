/* 

An Emirp Number (prime spelled backwards) is a prime number that results in a different prime when its decimal digits are reversed. This definition excludes the related palindromic primes. 

*/

class TwistedPrimeNumber {
    public static void main(String[] args) {
        int num = 73;
        

        if (isPrime(num)) {
            int reverseNum = 0;
            while (num > 0) {
                reverseNum = reverseNum * 10 + (num % 10);
                num /= 10;
            }
            if (isPrime(reverseNum)) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else {
            System.out.println(false);
        }
    }

    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

            for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
