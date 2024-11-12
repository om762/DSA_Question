// Put 1 at a given position in binary representation of a given number


import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.println("Number in Binary: " + Integer.toBinaryString(num));
        System.out.println(num | (1 << pos));

        sc.close();

    }
}