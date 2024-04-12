package org.example;

public class Main {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);
            if (res == -1) right = mid - 1;
            else if (res == 1) left = mid + 1;
            else return mid;
        }
        return right;
    }

    private int guess(int g) {
        int pick = 6;
        if (g > pick) return -1;
        else if (g < pick) return 1;
        else return 0;
    }
}