/*
Tech Number: a number with an even number of digits that has the following property: if the number is split into two equal halves, the square of the sum of those halves is equal to the number itself.
*/

class TechNumber {
    public static void main(String[] args) {
        int num = 3025;
        int org_num = num;
        int len = 0;

        while (num > 0) {        // len = String.length();
            len++;
            num /= 10;
        }

        num = org_num;

        if (len % 2 == 0) {
            int rightHalf = num % (int)Math.pow(10, len/2);
            int leftHalf = num / (int)Math.pow(10, len/2);

            if (Math.pow(rightHalf + leftHalf, 2) == org_num)
                System.out.println(true);
            else
                System.out.println(false);
        }
        else
            System.out.println(false);
    }
}
