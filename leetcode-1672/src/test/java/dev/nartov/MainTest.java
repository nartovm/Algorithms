package dev.nartov;

import static dev.nartov.Main.maximumWealth;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void maximumWealthTest() {
        System.out.println(maximumWealth(new int[][]{new int[]{1, 2, 3}, new int[]{3, 2, 1}}));
    }
}