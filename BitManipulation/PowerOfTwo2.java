public class PowerOfTwo2 {
    public static void main(String[] args) {
        int num = 127;
        int count = 0;

        while (num > 0) {
            count = count + num & 1;
            num = num >> 1;
        }

        if (count == 1)
            System.out.println("Yes, This number is Power of 2");
        else
            System.out.println("No, This number is not Power of 2");
    }
}