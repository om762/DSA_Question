class EvenAlphabetCol {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j % 2 == 0) 
                {
                    System.out.print((char) (65 + j) + " ");
                }
                else {
                    System.out.print((char) (97 + j) + " ");
                }
            }
            System.err.println();
        }
    }
}

