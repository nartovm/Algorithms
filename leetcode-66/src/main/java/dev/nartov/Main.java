package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] plusOne(int[] digits) {
        boolean nextPlace = true;

        int i = digits.length - 1;
        while (nextPlace) {
            if (digits[i] + 1 <= 9) {
                digits[i]++;
                nextPlace = false;
            } else {
                digits[i] = 0;
            }
            i--;
            if (i == -1 && nextPlace) {
                i = 0;
                int[] buf = new int[digits.length + 1];
                System.arraycopy(digits, 0, buf, 1, digits.length);
                digits = buf;
            }
        }
        return digits;
    }
}