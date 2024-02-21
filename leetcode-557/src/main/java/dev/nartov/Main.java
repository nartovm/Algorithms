package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String reverseWords(String s) {
        if (s.length() <= 1) return s;
        char[] arr = s.toCharArray();
        int l = 0;
        int r = 0;
        int start;
        while (l <= arr.length && r <= arr.length) {
            if (r == arr.length || arr[r] == ' ') {
                start = r + 1;
                r--;
                while (l < r) {
                    arr[l] = (char) (arr[r] + arr[l]);
                    arr[r] = (char) (arr[l] - arr[r]);
                    arr[l] = (char) (arr[l] - arr[r]);
                    l++;
                    r--;
                }
                r = start;
                l = r;
            } else {
                r++;
            }
        }
        return new String(arr);
    }

    private void processWord(StringBuilder sb, char[] s, int l, int r) {
        for (int i = r; i >= l; i--) {
            sb.append(s[i]);
        }
    }
}