package LeetCode;

public class MaximumXorOfTwoNumbersInAnArray {
    public static void main (String[] args) {
        int[] nums = new int[] {3,10,5,25,2,8};

        int result = findMaximumXOR(nums);
        System.out.println(result);

    }

    public static int findMaximumXOR(int[] nums) {

        int max = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                int n = nums[i]^nums[j];
                if(max < n) max = n;
            }
        }

        return max;
    }
}
