class BouncyNumber {
    public static void main(String[] args) {
        int num = 754321;
        int flag = 0; // 1 for increasing order and 0 for decreasing order 
        
        if (num % 10 == (num/10) % 10) {
            System.out.println(false);
            return;
        }
        else if (num % 10 > (num/10) % 10) {
            flag = 1;
        }

        int previous = num % 10;
        num /= 10;

        while (num > 0) {
            int current = num % 10;
            if ((flag == 0 & current < previous) | (flag == 1 & current > previous)) {
                System.out.println(false);
                return;
            }
            previous = current;
            num /= 10;
        }
        System.out.println(true);
    }
}
