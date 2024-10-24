/*

OUTPUT

5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 

*/

class CTPattern39 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - i + j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(n - i + j + 1 + " ");
            }
            System.out.println();
        }
    }
}