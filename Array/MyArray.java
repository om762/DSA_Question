public class MyArray {
    public static void printArray(int arr[]) {
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int sumArray(int arr[]) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static int productArray(int arr[]) {
        int product = 1;
        for (int val : arr) {
            product *= val;
        }
        return product;
    }

    public static int maxArray(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int minArray(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int secondMaxArray(int arr[]) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    public static int secondMinArray(int arr[]) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    public static int ThirdMaxArray(int arr[]) {
        int max = arr[0];
        int secondMax = arr[0];
        int ThirdMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                ThirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }
        }
        return ThirdMax;
    }

    public static int ThirdMinArray(int arr[]) {
        int min = arr[0];
        int secondMin = arr[0];
        int ThirdMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                ThirdMin = secondMin;
                secondMin = min;
                min = arr[i];
            }
        }
        return ThirdMin;
    }
}
