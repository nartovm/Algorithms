import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private final char DELIMITER = '#';
    //${length}${DELIMITER}${WORD}
    //5#Apple41#Good3#Bad

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(DELIMITER).append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.isEmpty()) return result;

        int i = 0;
        while (i < str.length()) {
            int delimiterIndex = str.indexOf(DELIMITER, i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            result.add(str.substring(delimiterIndex + 1, delimiterIndex + 1 + length));
            i = delimiterIndex + 1 + length;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().decode(new Solution().encode(new ArrayList<>(Arrays.asList()))));
        System.out.println(new Solution().decode(new Solution().encode(new ArrayList<>(Arrays.asList("")))));
        System.out.println(new Solution().decode(new Solution().encode(new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry")))));
    }

}
