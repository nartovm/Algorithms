package dev.nartov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;
        while (num != 0) {
            numberOfSteps++;
            if (num % 2 == 0) {
                num /= 2;
            } else num--;
        }
        return numberOfSteps;
    }

    public static void main(String[] args) {
        numberOfSteps(14);
    }
}