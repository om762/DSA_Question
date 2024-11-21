// Check whether the bit is set or not at a given position in binary representation of a given number

public class checkBit {
    public static void main(String[] args) {
        int num = 5; // Number to check
        int pos = 2; // Position of the bit to check

        // Create a mask by left-shifting 1 to the specified position
        int bitMask = 1 << pos;

        // Perform AND operation to isolate the bit at the position
        if ((num & bitMask) != 0) {
            System.out.printf("The bit at position %d in number %d is SET (1).", pos, num);
        } else {
            System.out.printf("The bit at position %d in number %d is NOT SET (0).", pos, num);
        }
    }
}
