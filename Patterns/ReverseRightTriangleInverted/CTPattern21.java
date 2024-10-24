/*

OUTPUT

5 4 3 2 1 
  5 4 3 2 
    5 4 3 
      5 4 
        5

*/

class CTPattern21 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print( n - j + 1 + " " );
            }
            System.out.println();
        }
    }
}