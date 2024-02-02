package dev.nartov;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void removeDuplicatesNormalTest() {
        int[] input = new int[] {1,1,2};
        int k = 2;
        int[] expected = new int[] {1,2};
        int resultK = new Solution().removeDuplicates(input);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i],input[i]);
        }
        Assertions.assertEquals(k,resultK);
    }

    @org.junit.jupiter.api.Test
    void removeDuplicatesNormalTest2() {
        int[] input = new int[] {1,1,1};
        int k = 1;
        int[] expected = new int[] {1};
        int resultK = new Solution().removeDuplicates(input);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i],input[i]);
        }
        Assertions.assertEquals(k,resultK);
    }
}