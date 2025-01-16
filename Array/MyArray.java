import java.util.Scanner;

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

    public static void inputArray(int arr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("All elements are entered.");
        scanner.close();
    }

    public static void printArrayRange(int arr[], int start, int end) {
        
    }

    public static void updateByIndex(int arr[], int index, int newValue) {
        if (index < 0 || index > arr.length){
            System.out.println("Invalid Index: Out of Range");
            return;
        }

        arr[index] = newValue;
    }

    public static int linearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

    public static void updateByValue(int arr[], int oldValue, int newValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue)
                arr[i] = newValue;     // For replacing all the oldValues by newValues
        }
    }


    public static int binarySearch(int arr[], int val) {
        int left = 0;
        int right = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            else if (arr[mid] > val) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
