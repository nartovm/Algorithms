package dev.nartov;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        char[] aChar;
        char[] bChar;

        if (aLength >= bLength) {
            aChar = a.toCharArray();
            bChar = new char[aLength];
            System.arraycopy(b.toCharArray(), 0, bChar, aLength - bLength, bLength);
            Arrays.fill(bChar, 0,aLength-bLength,'0');
        } else {
            bChar = b.toCharArray();
            aChar = new char[bLength];
            System.arraycopy(a.toCharArray(), 0, aChar, bLength - aLength, aLength);
            Arrays.fill(aChar, 0,bLength-aLength,'0');
        }

        StringBuilder sb = new StringBuilder();

        int saved = 0;
        for (int i = aChar.length - 1; i >= 0; i--) {
            if (aChar[i] == '1' && bChar[i] == '1') {
                if (saved > 0) {
                    sb.append('1');
                    saved--;
                } else {
                    sb.append('0');
                }
                saved++;
            } else if ((aChar[i] == '1' && bChar[i] == '0') || (aChar[i] == '0' && bChar[i] == '1')) {
                if (saved > 0) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            } else if (aChar[i] == '0' && bChar[i] == '0') {
                if (saved > 0) {
                    sb.append('1');
                    saved--;
                } else {
                    sb.append('0');
                }
            }
        }

        if (saved > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}