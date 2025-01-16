public class Accenture {
    public static int differenceOfSum(int n, int m) {
        int notDivisibleBym = 0;
        int DivisibleBym = 0;
// Use Double forLoop
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                notDivisibleBym += i;
            }
            else {
                DivisibleBym += i;
            }
        }

        return notDivisibleBym - DivisibleBym;
    }

    public static int largeSmallSum(int arr[]) {
        System.out.println(arr.length);
        if (arr.length <= 3) {
            return 0;
        }

        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[1];
        int secondSmallest = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0){
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
            }
            else {
                if (arr[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
            }
        }
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

        return secondLargest + secondSmallest;
        
    }
}