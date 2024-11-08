public class MysteryNumber {
    public static void main(String[] args) {
        int num = 22;

        for (int i = 1; i <= num / 2; i++) {
            if (num == i + reverse(i)) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    static int reverse(int num) {
        int reverse = 0;
        
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse;
    }
}
