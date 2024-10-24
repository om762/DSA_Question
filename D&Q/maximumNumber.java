class maximumNumber {
    public static void main(String[] args) {
        int arr[] = {59, 78, 93, 2, 64, 86, 3, 11, 2, 44, 19, 25, 43, 54, 34, 32, 63, 99, 49, 8};
        int max_number = findMaximum(arr, 0, arr.length - 1);
        System.out.println(max_number);
    }

    static int findMaximum(int arr[], int low, int high) {
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        int maxOfLeft = findMaximum(arr, low, mid);
        int maxOfRight = findMaximum(arr, mid + 1, high);

        return Integer.max(maxOfLeft, maxOfRight);
    }
}
