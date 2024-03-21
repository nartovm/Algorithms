package dev.nartov;

import java.util.HashSet;

public class Main {
    public boolean isHappy(int n) {
        int number = n;
        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(number)) {
            set.add(number);
            int buf = 0;
            while (number != 0) {
                int p = number % 10;
                buf += p * p;
                number /= 10;
            }
            number = buf;
        }

        return number == 1;
    }
}