package org.example;

public class Main {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (x == sqr) return mid;
            else if (x > sqr) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
}