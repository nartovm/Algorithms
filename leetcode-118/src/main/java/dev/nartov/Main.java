package dev.nartov;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows <= 0) {
            return list; // return empty list if non-positive numRows
        }

        list.add(new ArrayList<>());
        list.get(0).add(1);
        

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previous = list.get(i-1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previous.get(j)+previous.get(j-1));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}