package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                arr[arr.length - 1] = max; //saving max to temp
                max = arr[i];
                arr[i] = arr[arr.length - 1];
            } else arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}