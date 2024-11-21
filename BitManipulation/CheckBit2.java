public class CheckBit2 {
    public static void main(String[] args) {
        int num = 12;
        int pos = 2;

        if (((num >> pos) & 1) == 1)
            System.out.printf("The bit at position %d in number %d is SET (1).", pos, num);
        else
            System.out.printf("The bit at position %d in number %d is NOT SET (0).", pos, num);
    }
}
