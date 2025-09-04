import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int maxLength = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int currentLength = 1;
                int currentNum = n;
                while (set.contains(++currentNum)) {
                    currentLength++;
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
        }

        return maxLength;
    }
}