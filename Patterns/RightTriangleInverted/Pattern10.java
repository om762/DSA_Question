/* 

OUTPUT

5 6 7 8 9
4 5 6 7
3 4 5
2 3
1

 */


class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(n - i + j + " " );
            }
            System.out.println();
        }
    }
}
