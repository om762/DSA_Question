import java.util.Scanner;

public class binaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        scanner.close();

        String binaryStr = "";

        if (num == 0)
            binaryStr = "0";

        while (num > 0) {
            int reminder = num % 2;
            binaryStr = reminder + binaryStr;
            num = num / 2;
        }
        System.out.println(binaryStr);
    }
}
