/*

OUTPUT

5 
5 4 
5 4 3
5 4 3 2
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

class CTPattern38 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }
}