import java.util.Scanner;

public class countSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Binary Representation: " + Integer.toBinaryString(num));
        int count = 0;

        while (num > 0) {
            count += num & 1;
            num = num >> 1;
        }

        System.out.println("Number of 1's: " + count);


    }
}
