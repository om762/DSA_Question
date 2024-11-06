public class DuckNumber {
    public static void main(String[] args) {
        int num = 348493034;
        String numString = String.valueOf(num);

        if (numString.contains("0") && numString.charAt(0) != '0')
            System.out.println(true);
        else
            System.out.println(false);
    }
}
