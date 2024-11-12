// Check whether a number is even or odd without using % operator

import java.util.Scanner;

public class checkEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}

