public class leetcode {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {3, 2, 1};
        System.out.println(s.thirdMax(arr));
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int val : nums) {
            if (val > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = val;
            }
            else if (val > secondMax) {
                thirdMax = secondMax;
                secondMax = val;
            }
            else if (val > thirdMax) {
                thirdMax = val;
            }
        }

        if (thirdMax == secondMax) {
            return max;
        }
        return thirdMax;

    }
}