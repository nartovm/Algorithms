package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j == strs[i].length() || strs[i].charAt(j)!= c) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }


    public String longestCommonPrefix2(String[] strs) {

        if (strs.length == 1) return strs[0];

        char[][] strsCharArray = new char[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            strsCharArray[i] = strs[i].toCharArray();
        }

        boolean found = true;
        int length = 0;
        int prevLength = Integer.MAX_VALUE;

        if (strsCharArray[0].length == 0) return "";

        for (int i = 1; i < strsCharArray.length; i++) {
            if (strsCharArray[i].length == 0) return "";
            int j = 0;
            while (j < strsCharArray[i].length && j < strsCharArray[0].length && found) {
                if (strsCharArray[i][j] != strsCharArray[0][j]) {
                    found = false;
                } else {
                    j++;
                    length++;
                }
            }
            found = true;
            if (length == 0) return "";
            prevLength = Math.min(length, prevLength);
            length = 0;
        }

        return strs[0].substring(0, prevLength);
    }
}