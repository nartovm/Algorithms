package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            s[i] = (char) (s[i] + s[j]);
            s[j] = (char) (s[i] - s[j]);
            s[i] = (char) (s[i] - s[j]);
            i++;
            j--;
        }
    }

    public void reverseString2(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j) {
            char buf = s[i];
            s[i] = s[j];
            s[j] = buf;
            i++;
            j--;
        }
    }
}