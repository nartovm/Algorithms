package dev.nartov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testReplaceElementsCase1() {
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        Assertions.assertArrayEquals(expected, new Main().replaceElements(arr));
    }

}