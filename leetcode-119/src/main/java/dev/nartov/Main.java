package dev.nartov;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1); // Initially fill the list with 1s.
        }

        for (int i = 2; i <= rowIndex; i++) { // Start from row 2 since the first two rows are always [1] and [1,1].
            for (int j = i - 1; j > 0; j--) { // Update from the end to the beginning, skipping the first and last element.
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if (rowIndex == 0) return prev;

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            prev = curr;
        }
        return prev;
    }
}