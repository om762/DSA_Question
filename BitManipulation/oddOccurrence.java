// Given an array in which all number appear at even times and there is a number which appear odd times, find that number

public class oddOccurrence {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 8, 6, 7, 3, 8, 5, 6, 7, 6, 8};
        
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num ^= arr[i];
        }

        System.out.println(num);

    }
}
