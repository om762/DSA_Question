public class Alphabet {
    public static void main(String[] args) {
        int n = 5;
        int c = 65;
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) 
            {
                System.err.print((char) c + " ");
            }
            c++;
            System.out.println();
        }
    }
}
