/*
OUTPUT

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/

class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++)
        {
            int k=n-1;
            int v=i;
            for (int j = 1; j <=i; j++)
            {

                System.out.print(v + " ");
                v=v+k--;

                
            }
            System.out.println();
        }
    }
}