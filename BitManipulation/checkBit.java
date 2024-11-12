// Check whether the bit is set or not at a given position in binary representation of a given number

import java.util.Scanner;

public class checkBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        System.out.println(Integer.toBinaryString(num));
        if ((num & bitMask) != 0)
            System.out.println("Bit is set at position " + pos);
        else
            System.out.println("Bit is not set at position " + pos);
        sc.close();

    }
}