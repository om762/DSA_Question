public class powerOfTwo3 {
    public static void main(String[] args) {
        int n = 676;

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println("Yes, This number is Power of 2");
        else
            System.out.println("No, This number is not Power of 2");
    }
}
