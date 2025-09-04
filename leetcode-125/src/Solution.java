class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(".,"));
        System.out.println(new Solution().isPalindrome("0P"));
        System.out.println(new Solution().isPalindrome("ab"));
        System.out.println(new Solution().isPalindrome("A man, a plan, a ca!nal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome(" "));
    }
}