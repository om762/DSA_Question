import java.util.Scanner;

public class checkEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        z
        int bitMask = 1 << pos;

        System.out.println(num & ~bitMask);

        sc.close();

    }
}