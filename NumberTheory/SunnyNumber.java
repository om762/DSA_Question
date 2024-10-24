class SunnyNumber {
    public static void main(String[] args) {
        int num = 25;
        int next_num = num + 1;

        for (int i = 1; i < next_num / 2; i++) {
            if (i * i  == next_num) {
                System.out.println(true);
                System.exit(i);
            }
        }
        System.out.println(false);
    }
}