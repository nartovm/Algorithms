package dev.nartov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test1() {
        System.out.println(new Main().reverseWords("  hello world  "));
    }

}