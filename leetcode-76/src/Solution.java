import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.length() > s.length()) {
            return "";
        }
        //should I store the last valid window?
//        String result = "";
        int resultLeft = -1;
        int resultRight = -1;
        int counter = t.length();

        Map<Character, Integer> searchMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            searchMap.merge(c, 1, Integer::sum);
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (searchMap.containsKey(rightChar)) {
                int value = searchMap.get(rightChar);
                if (value > 0) {
                    counter--;
                }
                searchMap.put(rightChar, value - 1);
            }
            while (counter == 0 && left <= right) {
                int newResult = right - left + 1;
                if ((resultRight == -1 && resultLeft == -1) || newResult < resultRight - resultLeft + 1) {
                    resultRight = right;
                    resultLeft = left;
                }
                char leftChar = s.charAt(left);
                if (searchMap.containsKey(leftChar)) {
                    searchMap.put(leftChar, searchMap.get(leftChar) + 1);
                    if (searchMap.get(leftChar) > 0) {
                        counter++;
                    }
                }
                left++;
            }
        }
        if (resultRight != -1 && resultLeft != -1) {
            return s.substring(resultLeft, resultRight + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ab", "b"));
        System.out.println(new Solution().minWindow("a", "a"));
        System.out.println(new Solution().minWindow("a", "aa"));
        System.out.println(new Solution().minWindow("ADOBECODEBANC", "ABC"));
    }
}