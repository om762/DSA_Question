/*

OUTPUT

9 8 7 6 5 4 3 2 1 
  7 6 5 4 3 2 1
    5 4 3 2 1
      3 2 1
        1

*/

class CTPattern31 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print(2 * n - 2 * i - j + 2 + " ");
            }

            System.out.println();
        }
    }
}
