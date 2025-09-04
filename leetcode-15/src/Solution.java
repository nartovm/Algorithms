import java.sql.Array;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length <= 2) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int n1 = nums[i];
            int target = -n1;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int n2 = nums[left];
                int n3 = nums[right];
                if (n2 + n3 > target) {
                    right--;
                } else if (n2 + n3 < target) {
                    left++;
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(n1, n2, n3));
                    result.add(list);
                    while (left < nums.length - 1 && nums[left] == nums[left + 1] && left < right) {
                        left++;
                    }
                    while (nums[right] == nums[right - 1] && left < right) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
//            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
//                i++;
//            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new Solution().threeSum(new int[]{-1,0, 0, 0}));

    }
}