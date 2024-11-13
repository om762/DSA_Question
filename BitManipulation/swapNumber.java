public class swapNumber {
    public static void main(String[] args) {
        int a = 4, b = 5;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("Number after swap a: %d, b: %d", a, b);
    }
}
