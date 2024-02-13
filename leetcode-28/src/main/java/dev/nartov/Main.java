package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int strStr(String haystack, String needle) {
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        if (needleArray.length > haystackArray.length) return -1;

        boolean found = true;

        for (int i = 0; i < haystackArray.length; i++) {
            found = true;
            int j = 0;
            while (j < needleArray.length && i + j < haystackArray.length) {
                if (haystackArray[i + j] != needleArray[j]) {
                    found = false;
                    break;
                }
                j++;
            }
            if (found && j == needleArray.length) {
                return i;
            }
        }
        return -1;
    }
}