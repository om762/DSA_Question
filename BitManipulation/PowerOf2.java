import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        num = num - 1;
        sc.close();
        
        while (num > 0) {
            if ((num & 1) == 0) {
                System.out.println("Not power of 2");
                return;
            }
            num = num >> 1;
        }
        System.out.println("This number can be represent as power of 2");
        
    }
}
