/*
An evil number is a non-negative number that has an even number of 1s in its binary expansion. (Binary Expansion – is representation of a number in the binary numeral system or base-2 numeral system which represents numeric values using two different symbols: typically 0 (zero) and 1 (one)).
*/

class EvilNumber {
    public static void main(String[] args) {
        int num = 15;
        if (countOne(toBoolean(num)) % 2 == 0)
            System.out.println(true);
        else
            System.out.println(false);
    }

    // Number to binary
    static long toBoolean(int num) {
        long binaryNum = 0;
        long shifter = 1;

        while (num > 0) {
            int reminder = num % 2;
            binaryNum = reminder * shifter + binaryNum;
            shifter *= 10;
            num /= 2;
        }
        return binaryNum;
    }

    static int countOne(long num) {
        int numberOfOne = 0;
        while (num > 0) {
            if (num % 10 == 1)
                numberOfOne++;
            num /= 10;
        }
        return numberOfOne;
    }
}
