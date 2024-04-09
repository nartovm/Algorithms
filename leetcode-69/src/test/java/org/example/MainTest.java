package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        int x = 2147395599;
        System.out.println(new Main().mySqrt(x));
    }

}