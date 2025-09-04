//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int right = height.length - 1;
        for (int left = 0; left < right;) {
            int volume = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(volume, result);
            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}