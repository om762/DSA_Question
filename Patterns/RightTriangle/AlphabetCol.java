/*
OUTPUT

A 
A B 
A B C 
A B C D 
A B C D E 

*/

class AlphabetCol {
        public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
    }
}
