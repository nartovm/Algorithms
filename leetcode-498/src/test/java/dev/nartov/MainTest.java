package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(new Main().findDiagonalOrder(mat)));
    }

    @Test
    public void test2(){
        int[][] mat = new int[][]{{2,3}};
        System.out.println(Arrays.toString(new Main().findDiagonalOrder(mat)));
    }

}