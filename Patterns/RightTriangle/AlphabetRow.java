/*
OUTPUT

A 
B B 
C C C 
D D D D 
E E E E E 

*/

class AlphabetRow {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (64 + i) + " ");
            }
            System.out.println();
        }
    }
}