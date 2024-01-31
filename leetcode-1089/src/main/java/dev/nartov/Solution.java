package dev.nartov;

class Solution {
//    public void duplicateZeros2(int[] arr) {
//        if (arr.length > 1) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == 0) {
//                    for (int j = arr.length - 1; j > i; j--) {
//                        arr[j] = arr[j - 1];
//                    }
//                    i++;
//                }
//            }
//        }
//    }

    public void duplicateZeros(int[] arr) {
        int zerosToMove = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length - zerosToMove; i++) {
            if (arr[i] == 0) {
                if (i == length - zerosToMove) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                zerosToMove++;
            }
        }

        for (int i = length - zerosToMove; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[i + zerosToMove] = arr[i];
            } else {
                arr[i + zerosToMove] = 0;
                zerosToMove--;
                arr[i + zerosToMove] = 0;
            }
        }
    }
}