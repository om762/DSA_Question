class BouncyNumber {
    public static void main(String[] args) {
        int num = 754821;
        
        // Handle numbers less than 100 (not bouncy)
        if (num < 100) {
            System.out.println(false);
            return;
        }

        boolean isIncreasing = false;
        boolean isDecreasing = false;
        
        int previous = num % 10;
        num /= 10;

        while (num > 0) {
            int current = num % 10;
            if (current < previous) {
                isDecreasing = true;
            } else if (current > previous) {
                isIncreasing = true;
            }
            
            // If both increasing and decreasing patterns are found, it's a bouncy number
            if (isIncreasing && isDecreasing) {
                System.out.println(true);
                return;
            }

            previous = current;
            num /= 10;
        }

        // If only increasing or only decreasing, it's not bouncy
        System.out.println(false);
    }
}
