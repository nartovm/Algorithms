package dev.nartov;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void test1() {
        char[] s = new char[]{'h','e','l','l','o'};
        new Main().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}