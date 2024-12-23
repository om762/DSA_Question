import java.util.Scanner;

public class ResetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.println("Number in Binary: " + Integer.toBinaryString(num));
        System.out.println(num & ~bitMask);
        sc.close();
    }
}