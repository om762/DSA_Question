class BouncyNumber {
    public static void main(String[] args) {
        int num = 754321;
        boolean isIncreasing = false; // true for increasing order and false for decreasing order 
        
        if (num % 10 == (num/10) % 10) {
            System.out.println(false);
            return;
        }
        else if (num % 10 > (num/10) % 10) {
            isIncreasing = true;
        }

        int previous = num % 10;
        num /= 10;

        while (num > 0) {
            int current = num % 10;
            if (( ! isIncreasing & current < previous) | ( isIncreasing & current > previous)) {
                System.out.println(false);
                return;
            }
            previous = current;
            num /= 10;
        }
        System.out.println(true);
    }
}
