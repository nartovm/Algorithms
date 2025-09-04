import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        int postfix = 1;
        //prefix
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        //postfix
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] *  postfix;
            postfix = postfix * nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }
}