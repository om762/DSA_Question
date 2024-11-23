public class HammingDistance {
    public static void main(String[] args) {
        int a = 5;
        int b = 45;

        int hammingDistance = 0;

        int xorResult = a ^ b;

        while (xorResult > 0) {
            hammingDistance++;
            xorResult = xorResult & (xorResult - 1);
        }

        System.out.println("Hamming Distance: " + hammingDistance);
    }
}
