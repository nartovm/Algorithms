package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int [][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        new Main().spiralOrder(matrix);
    }

}