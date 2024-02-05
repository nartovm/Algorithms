package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int a = 0;
        int b = arr.length - 1;

        while (a + 1 < arr.length - 1 && arr[a] < arr[a + 1]) a++;
        while (b - 1 > 0 && arr[b] < arr[b - 1]) b--;
        return a == b;
    }
}