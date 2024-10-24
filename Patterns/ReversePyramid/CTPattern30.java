/*

OUTPUT

9 8 7 6 5 4 3 2 1 
  9 8 7 6 5 4 3
    9 8 7 6 5
      9 8 7
        9

*/

class CTPattern30 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print(2 * n - j + " ");
            }

            System.out.println();
        }
    }
}
