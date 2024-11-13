public class findMissingNumber {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10};

        int x1 = 0, x2 = 0;

        for (int i = 0; i < arr.length; i++) {
            x1 ^= arr[i];
        }

        for (int i = 0; i <= arr.length; i++) {
            x2 ^= i;
        }

        System.out.println("Missing Number from 0 to " + arr.length + " is " + (x1 ^ x2));
    }
}
