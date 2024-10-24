class SunnyNumber2 {
    public static void main(String[] args) {
        int n = 37;

        if (Math.sqrt(n + 1) - Math.floor(Math.sqrt(n + 1)) == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
