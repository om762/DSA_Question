/*
Fascinating Number: When a number( 3 digits or more ) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.
*/

// I solved this only using number data type and boolean. It is of the worst solution.

class FascinatingNumber {
    public static void main(String[] args) {
        for (int p = 100; p < 100000; p++ ) {
            check(p);
        }
    }
    
    static void check(int p) {
        int num = p;
            int org_num = num;
            int len = 0;

            // if (num < 100) {
            //     // System.out.println(false);
            //     return;
            // }

            while (num > 0) {
                len++;
                num /= 10;
            }
            num = org_num;

            int multipliedBy2 = num * 2;
            int multipliedBy3 = num * 3;

            int org_multipliedBy2 = multipliedBy2;
            int org_multipliedBy3 = multipliedBy3;

            int multipliedBy3Length = 0;
            int multipliedBy2Length = 0;


            while (multipliedBy2 > 0) {
                multipliedBy2Length++;
                multipliedBy2 /= 10;
            }
            while (multipliedBy3 > 0) {
                multipliedBy3Length++;
                multipliedBy3 /= 10;
            }

            if (multipliedBy2Length + multipliedBy3Length + len != 9) {
                // System.out.println(false);
                return;
            }

            int concatenatedNumber = (org_multipliedBy2 * (int) Math.pow(10, multipliedBy3Length) + org_multipliedBy3) * (int) Math.pow(10, len) + num;

            int org_concatenatedNumber = concatenatedNumber;

            boolean all_good = true;
            for (int i = 1; i <= 9; i++) {
                if (!all_good) {
                    // System.out.println(false);
                    return;
                }
                all_good = false;
                concatenatedNumber = org_concatenatedNumber;
                while (concatenatedNumber > 0) {
                    int digit = concatenatedNumber % 10;
                    if (digit == i) {
                        all_good = true;
                        break;
                    }
                    concatenatedNumber /= 10;
                }
            }

            System.out.println(p);
    }
}