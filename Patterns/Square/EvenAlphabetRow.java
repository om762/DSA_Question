class EvenAlphabetRow {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i % 2 == 0) 
                {
                    System.out.print((char) (65 + i) + " ");
                }
                else {
                    System.out.print((char) (97 + i) + " ");
                }
            }
            System.err.println();
        }
    }
}
