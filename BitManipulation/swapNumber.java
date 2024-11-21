public class swapNumber {
    public static void main(String[] args) {
        int a = 5, b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("Number after swap a: %d, b: %d", a, b);
    }
}
