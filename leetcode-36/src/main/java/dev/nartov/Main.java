package dev.nartov;

import java.util.*;

public class Main {

    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowMaps = new HashSet[9];
        Set<Character>[] colMaps = new HashSet[9];
        Set<Character>[] subBoxMaps = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rowMaps[i] = new HashSet<>();
            colMaps[i] = new HashSet<>();
            subBoxMaps[i] = new HashSet<>();
        }

        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            for (int colIndex = 0; colIndex < 9; colIndex++) {
                char value = board[rowIndex][colIndex];
                if (value != '.') {
                    if (!rowMaps[rowIndex].add(value)) {
                        return false;
                    }
                    if (!colMaps[colIndex].add(value) ) {
                        return false;
                    }
                    int subBoxIndex = 3 * (rowIndex / 3) + (colIndex / 3);
                    if (!subBoxMaps[subBoxIndex].add(value)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku1(char[][] board) {
        Set<Key> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char symbol = board[i][j];
                if (symbol != '.') {
                    if (symbol == '8') {
                        System.out.println();
                    }
                    if (!set.add(new Key(symbol, i, -1, -1)) ||
                            !set.add(new Key(symbol, -1, j, -1)) ||
                            !set.add(new Key(symbol, -1, -1, (i / 3) * 10 + j / 3))
                    ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static class Key {
        char symbol;
        int i;
        int j;
        int box;

        public Key(char symbol, int i, int j, int box) {
            this.symbol = symbol;
            this.i = i;
            this.j = j;
            this.box = box;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return symbol == key.symbol && i == key.i && j == key.j && box == key.box;
        }

        @Override
        public int hashCode() {
            return Objects.hash(symbol, i, j, box);
        }
    }


    public boolean isValidSudoku2(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char symbol = board[i][j];
                if (symbol != '.') {
                    if (!set.add("c" + i + symbol) ||
                            !set.add("r" + j + symbol) ||
                            !set.add("b" + i / 3 + j / 3 + symbol)
                    ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
