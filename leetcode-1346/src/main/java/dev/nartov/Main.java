package dev.nartov;

import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) return true;
            seen.add(num);
        }
        return false;
    }


    public boolean checkIfExist2(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (search(i, 2, arr, 0, arr.length - 1)) return true;
        }
        return false;
    }

    public boolean search(int i, int multiplier, int[] arr, int start, int end) {

        int number = arr[i] * multiplier;

        if (number < arr[start] || number > arr[end]) return false;

        int middle = start + (end - start) / 2;

        if (arr[middle] == number)
            return i != middle;
        if (start < end) {
            if (number < arr[middle])
                return search(i, 2, arr, start, middle);
            else return search(i, 2, arr, middle + 1, end);
        } else return false;
    }
}