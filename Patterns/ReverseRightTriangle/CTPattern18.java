/*

Change in loop: Increment from left to right and decrement from up to down.
OUTPUT

        5 
      4 5 
    3 4 5 
  2 3 4 5 
1 2 3 4 5 

*/

class CTPattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}