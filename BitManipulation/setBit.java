import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        System.out.println(num | (1 << pos));

        sc.close();

    }
}