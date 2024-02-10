package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        new Main().findDiagonalOrder(mat);
    }

}