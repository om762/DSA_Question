/* 

OUTPUT

5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 

 */


class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(n - i - j + 2 + " " );
            }
            System.out.println();
        }
    }
}
