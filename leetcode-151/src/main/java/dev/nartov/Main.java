package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public String reverseWords2(String s) {
//        s = s.replace(" +", " ");
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean space = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                space = false;
                sb.append(arr[i]);
            } else {
                if (!space) {
                    sb.append(arr[i]);
                    space = true;
                }
            }
        }
        return sb.toString().trim();
    }


    public String reverseWords(String s) {
        String[] arr = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}